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
import com.tools20022.repository.area.SecuritiesSettlementPreviousVersion;
import com.tools20022.repository.choice.UpdateType14Choice;
import com.tools20022.repository.msg.TransactionDetails76;
import com.tools20022.repository.msgset.SettlementAndReconciliationISOPreviousversion;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code sese.038.001.04}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesSettlementPreviousVersion
 * SecuritiesSettlementPreviousVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.SettlementAndReconciliationISOPreviousversion
 * SettlementAndReconciliationISOPreviousversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "SctiesSttlmTxModReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestV04#mmModifiedTransactionDetails
 * SecuritiesSettlementTransactionModificationRequestV04.
 * mmModifiedTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestV04#mmUpdateType
 * SecuritiesSettlementTransactionModificationRequestV04.mmUpdateType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesSettlementTransactionModificationRequestV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThis message is sent by an account owner to an account servicer. \r\n\r\nThe account owner will generally be:\r\n- a central securities depository participant which has an account with a central securities depository or a market infrastructure\r\n- an investment manager which has an account with a custodian acting as accounting and/or settlement agent.\r\n\r\nIt is used to request the modification of non core business data (matching or non-matching) information in a pending or settled instruction. It can also be used for the enrichment of an incomplete transaction.\r\n\r\nUsage\r\nThe modification must only contain the data to be modified.\r\nThe message may also be used to:\r\n- re-send a message sent by the account owner to the account servicer,\r\n- provide a third party with a copy of a message being sent by the account owner for information,\r\n- re-send to a third party a copy of a message being sent by the account owner for information\r\nusing the relevant elements in the Business Application Header."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestV05
 * SecuritiesSettlementTransactionModificationRequestV05}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestV03
 * SecuritiesSettlementTransactionModificationRequestV03}</li>
 * </ul>
 */
public class SecuritiesSettlementTransactionModificationRequestV04 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected TransactionDetails76 modifiedTransactionDetails;
	/**
	 * Identifies the details of the transaction that is being modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails76
	 * TransactionDetails76}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestV05#mmModifiedTransactionDetails
	 * SecuritiesSettlementTransactionModificationRequestV05.
	 * mmModifiedTransactionDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestV03#mmModifiedTransactionDetails
	 * SecuritiesSettlementTransactionModificationRequestV03.
	 * mmModifiedTransactionDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmModifiedTransactionDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "ModfdTxDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedTransactionDetails";
			definition = "Identifies the details of the transaction that is being modified.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionModificationRequestV05.mmModifiedTransactionDetails);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionModificationRequestV03.mmModifiedTransactionDetails;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TransactionDetails76.mmObject();
		}
	};
	protected List<UpdateType14Choice> updateType;
	/**
	 * Specifies the type of update requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UpdateType14Choice
	 * UpdateType14Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestV05#mmUpdateType
	 * SecuritiesSettlementTransactionModificationRequestV05.mmUpdateType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionModificationRequestV03#mmUpdateType
	 * SecuritiesSettlementTransactionModificationRequestV03.mmUpdateType}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmUpdateType = new MMMessageBuildingBlock() {
		{
			xmlTag = "UpdTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UpdateType";
			definition = "Specifies the type of update requested.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionModificationRequestV05.mmUpdateType);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionModificationRequestV03.mmUpdateType;
			maxOccurs = 3;
			minOccurs = 1;
			complexType_lazy = () -> UpdateType14Choice.mmObject();
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesSettlementTransactionModificationRequestV04";
				definition = "Scope\r\nThis message is sent by an account owner to an account servicer. \r\n\r\nThe account owner will generally be:\r\n- a central securities depository participant which has an account with a central securities depository or a market infrastructure\r\n- an investment manager which has an account with a custodian acting as accounting and/or settlement agent.\r\n\r\nIt is used to request the modification of non core business data (matching or non-matching) information in a pending or settled instruction. It can also be used for the enrichment of an incomplete transaction.\r\n\r\nUsage\r\nThe modification must only contain the data to be modified.\r\nThe message may also be used to:\r\n- re-send a message sent by the account owner to the account servicer,\r\n- provide a third party with a copy of a message being sent by the account owner for information,\r\n- re-send to a third party a copy of a message being sent by the account owner for information\r\nusing the relevant elements in the Business Application Header.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionModificationRequestV05.mmObject());
				previousVersion_lazy = () -> SecuritiesSettlementTransactionModificationRequestV03.mmObject();
				messageSet_lazy = () -> Arrays.asList(SettlementAndReconciliationISOPreviousversion.mmObject());
				rootElement = "Document";
				xmlTag = "SctiesSttlmTxModReq";
				businessArea_lazy = () -> SecuritiesSettlementPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionModificationRequestV04.mmModifiedTransactionDetails, SecuritiesSettlementTransactionModificationRequestV04.mmUpdateType);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "sese";
						messageFunctionality = "038";
						version = "04";
						flavour = "001";
					}
				};
			}
		});
		return mmObject_lazy.get();
	}

	public TransactionDetails76 getModifiedTransactionDetails() {
		return modifiedTransactionDetails;
	}

	public void setModifiedTransactionDetails(TransactionDetails76 modifiedTransactionDetails) {
		this.modifiedTransactionDetails = modifiedTransactionDetails;
	}

	public List<UpdateType14Choice> getUpdateType() {
		return updateType;
	}

	public void setUpdateType(List<UpdateType14Choice> updateType) {
		this.updateType = updateType;
	}
}