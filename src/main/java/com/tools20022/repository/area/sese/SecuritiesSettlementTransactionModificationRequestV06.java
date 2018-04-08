/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.area.sese;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesSettlementLatestVersion;
import com.tools20022.repository.choice.UpdateType27Choice;
import com.tools20022.repository.msg.TransactionDetails106;
import com.tools20022.repository.msgset._SR2018_SettlementandReconciliation;
import com.tools20022.repository.msgset.SettlementAndReconciliationISOLatestversion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * This message is sent by an account owner to an account servicer. <br>
 * <br>
 * The account owner will generally be:<br>
 * - a central securities depository participant which has an account with a
 * central securities depository or a market infrastructure<br>
 * - an investment manager which has an account with a custodian acting as
 * accounting and/or settlement agent.<br>
 * <br>
 * It is used to request the modification of non core business data (matching or
 * non-matching) information in a pending or settled instruction. It can also be
 * used for the enrichment of an incomplete transaction.<br>
 * <br>
 * <b>Usage</b><br>
 * The modification must only contain the data to be modified.<br>
 * The message may also be used to:<br>
 * - re-send a message sent by the account owner to the account servicer,<br>
 * - provide a third party with a copy of a message being sent by the account
 * owner for information,<br>
 * - re-send to a third party a copy of a message being sent by the account
 * owner for information<br>
 * using the relevant elements in the Business Application Header.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestV06#mmModifiedTransactionDetails
 * SecuritiesSettlementTransactionModificationRequestV06.
 * mmModifiedTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestV06#mmUpdateType
 * SecuritiesSettlementTransactionModificationRequestV06.mmUpdateType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.SettlementAndReconciliationISOLatestversion
 * SettlementAndReconciliationISOLatestversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset._SR2018_SettlementandReconciliation
 * _SR2018_SettlementandReconciliation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "SctiesSttlmTxModReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesSettlementLatestVersion
 * SecuritiesSettlementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code sese.038.001.06}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalInstructionDetailsUsageRule#for_sese_SecuritiesSettlementTransactionModificationRequestV06
 * ConstraintPhysicalInstructionDetailsUsageRule.
 * for_sese_SecuritiesSettlementTransactionModificationRequestV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesFinancingSettlementUsageRule#for_sese_SecuritiesSettlementTransactionModificationRequestV06
 * ConstraintSecuritiesFinancingSettlementUsageRule.
 * for_sese_SecuritiesSettlementTransactionModificationRequestV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintLinkagesUsageRule#for_sese_SecuritiesSettlementTransactionModificationRequestV06
 * ConstraintLinkagesUsageRule.
 * for_sese_SecuritiesSettlementTransactionModificationRequestV06}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesSettlementTransactionModificationRequestV06"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThis message is sent by an account owner to an account servicer. \r\n\r\nThe account owner will generally be:\r\n- a central securities depository participant which has an account with a central securities depository or a market infrastructure\r\n- an investment manager which has an account with a custodian acting as accounting and/or settlement agent.\r\n\r\nIt is used to request the modification of non core business data (matching or non-matching) information in a pending or settled instruction. It can also be used for the enrichment of an incomplete transaction.\r\n\r\nUsage\r\nThe modification must only contain the data to be modified.\r\nThe message may also be used to:\r\n- re-send a message sent by the account owner to the account servicer,\r\n- provide a third party with a copy of a message being sent by the account owner for information,\r\n- re-send to a third party a copy of a message being sent by the account owner for information\r\nusing the relevant elements in the Business Application Header."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestV05
 * SecuritiesSettlementTransactionModificationRequestV05}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesSettlementTransactionModificationRequestV06", propOrder = {"modifiedTransactionDetails", "updateType"})
public class SecuritiesSettlementTransactionModificationRequestV06 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ModfdTxDtls", required = true)
	protected TransactionDetails106 modifiedTransactionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails106
	 * TransactionDetails106}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ModfdTxDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModifiedTransactionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the details of the transaction that is being modified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestV05#mmModifiedTransactionDetails
	 * SecuritiesSettlementTransactionModificationRequestV05.
	 * mmModifiedTransactionDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionModificationRequestV06, TransactionDetails106> mmModifiedTransactionDetails = new MMMessageBuildingBlock<SecuritiesSettlementTransactionModificationRequestV06, TransactionDetails106>() {
		{
			xmlTag = "ModfdTxDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedTransactionDetails";
			definition = "Identifies the details of the transaction that is being modified.";
			previousVersion_lazy = () -> SecuritiesSettlementTransactionModificationRequestV05.mmModifiedTransactionDetails;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TransactionDetails106.mmObject();
		}

		@Override
		public TransactionDetails106 getValue(SecuritiesSettlementTransactionModificationRequestV06 obj) {
			return obj.getModifiedTransactionDetails();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionModificationRequestV06 obj, TransactionDetails106 value) {
			obj.setModifiedTransactionDetails(value);
		}
	};
	@XmlElement(name = "UpdTp", required = true)
	protected List<UpdateType27Choice> updateType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UpdateType27Choice
	 * UpdateType27Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UpdTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UpdateType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of update requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestV05#mmUpdateType
	 * SecuritiesSettlementTransactionModificationRequestV05.mmUpdateType}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionModificationRequestV06, List<UpdateType27Choice>> mmUpdateType = new MMMessageBuildingBlock<SecuritiesSettlementTransactionModificationRequestV06, List<UpdateType27Choice>>() {
		{
			xmlTag = "UpdTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UpdateType";
			definition = "Specifies the type of update requested.";
			previousVersion_lazy = () -> SecuritiesSettlementTransactionModificationRequestV05.mmUpdateType;
			maxOccurs = 3;
			minOccurs = 1;
			complexType_lazy = () -> UpdateType27Choice.mmObject();
		}

		@Override
		public List<UpdateType27Choice> getValue(SecuritiesSettlementTransactionModificationRequestV06 obj) {
			return obj.getUpdateType();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionModificationRequestV06 obj, List<UpdateType27Choice> value) {
			obj.setUpdateType(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPhysicalInstructionDetailsUsageRule.for_sese_SecuritiesSettlementTransactionModificationRequestV06,
						com.tools20022.repository.constraints.ConstraintSecuritiesFinancingSettlementUsageRule.for_sese_SecuritiesSettlementTransactionModificationRequestV06,
						com.tools20022.repository.constraints.ConstraintLinkagesUsageRule.for_sese_SecuritiesSettlementTransactionModificationRequestV06);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesSettlementTransactionModificationRequestV06";
				definition = "Scope\r\nThis message is sent by an account owner to an account servicer. \r\n\r\nThe account owner will generally be:\r\n- a central securities depository participant which has an account with a central securities depository or a market infrastructure\r\n- an investment manager which has an account with a custodian acting as accounting and/or settlement agent.\r\n\r\nIt is used to request the modification of non core business data (matching or non-matching) information in a pending or settled instruction. It can also be used for the enrichment of an incomplete transaction.\r\n\r\nUsage\r\nThe modification must only contain the data to be modified.\r\nThe message may also be used to:\r\n- re-send a message sent by the account owner to the account servicer,\r\n- provide a third party with a copy of a message being sent by the account owner for information,\r\n- re-send to a third party a copy of a message being sent by the account owner for information\r\nusing the relevant elements in the Business Application Header.";
				previousVersion_lazy = () -> SecuritiesSettlementTransactionModificationRequestV05.mmObject();
				messageSet_lazy = () -> Arrays.asList(SettlementAndReconciliationISOLatestversion.mmObject(), _SR2018_SettlementandReconciliation.mmObject());
				rootElement = "Document";
				xmlTag = "SctiesSttlmTxModReq";
				businessArea_lazy = () -> SecuritiesSettlementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestV06.mmModifiedTransactionDetails,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestV06.mmUpdateType);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "sese";
						messageFunctionality = "038";
						version = "06";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesSettlementTransactionModificationRequestV06.class;
			}
		});
		return mmObject_lazy.get();
	}

	public TransactionDetails106 getModifiedTransactionDetails() {
		return modifiedTransactionDetails;
	}

	public SecuritiesSettlementTransactionModificationRequestV06 setModifiedTransactionDetails(TransactionDetails106 modifiedTransactionDetails) {
		this.modifiedTransactionDetails = Objects.requireNonNull(modifiedTransactionDetails);
		return this;
	}

	public List<UpdateType27Choice> getUpdateType() {
		return updateType == null ? updateType = new ArrayList<>() : updateType;
	}

	public SecuritiesSettlementTransactionModificationRequestV06 setUpdateType(List<UpdateType27Choice> updateType) {
		this.updateType = Objects.requireNonNull(updateType);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.038.001.06")
	static public class Document {
		@XmlElement(name = "SctiesSttlmTxModReq", required = true)
		public SecuritiesSettlementTransactionModificationRequestV06 messageBody;
	}
}