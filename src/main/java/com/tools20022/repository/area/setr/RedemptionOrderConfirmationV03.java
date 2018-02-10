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

package com.tools20022.repository.area.setr;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesTradePreviousVersion;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.InvestmentFundsISOPreviousversion;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An executing party, for example, a transfer agent, sends the
 * RedemptionOrderConfirmation message to the instructing party, for example, an
 * investment manager or its authorised representative to confirm the details of
 * execution for a previously received RedemptionOrder message.<br>
 * <b>Usage</b><br>
 * The RedemptionOrderConfirmation message is used to confirm the execution of
 * one or more individual orders.<br>
 * A RedemptionOrder message containing more than one individual order may be
 * responded to by more than one RedemptionOrderConfirmation message, as the
 * valuation cycle of the financial instruments in each individual order may be
 * different.<br>
 * Each individual order confirmation specified is identified in DealReference.
 * The reference of the original individual order is specified in
 * OrderReference. The message identification of the RedemptionOrder message in
 * which the individual order was conveyed may also be quoted in
 * RelatedReference.<br>
 * When the executing party sends several confirmations, there is no specific
 * indication in the message that it is an incomplete confirmation.
 * Reconciliation should be based on the references.<br>
 * A RedemptionOrder must in all cases be responded to by a
 * RedemptionOrderConfirmation message and in no circumstances by a
 * RedemptionBulkOrderConfirmation message.<br>
 * If the executing party needs to confirm a RedemptionBulkOrder message, then a
 * RedemptionBulkOrderConfirmation message must be used.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationV03#mmMessageIdentification
 * RedemptionOrderConfirmationV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationV03#mmPoolReference
 * RedemptionOrderConfirmationV03.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationV03#mmPreviousReference
 * RedemptionOrderConfirmationV03.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationV03#mmRelatedReference
 * RedemptionOrderConfirmationV03.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationV03#mmMultipleExecutionDetails
 * RedemptionOrderConfirmationV03.mmMultipleExecutionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationV03#mmRelatedPartyDetails
 * RedemptionOrderConfirmationV03.mmRelatedPartyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationV03#mmCopyDetails
 * RedemptionOrderConfirmationV03.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationV03#mmExtension
 * RedemptionOrderConfirmationV03.mmExtension}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.InvestmentFundsISOPreviousversion
 * InvestmentFundsISOPreviousversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "RedOrdrConfV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesTradePreviousVersion
 * SecuritiesTradePreviousVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code setr.006.001.03}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationRule#forRedemptionOrderConfirmationV03
 * ConstraintAccountIdentificationRule.forRedemptionOrderConfirmationV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOrderReferenceRule#forRedemptionOrderConfirmationV03
 * ConstraintOrderReferenceRule.forRedemptionOrderConfirmationV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintRelatedPartiesDetailsRule#forRedemptionOrderConfirmationV03
 * ConstraintRelatedPartiesDetailsRule.forRedemptionOrderConfirmationV03}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RedemptionOrderConfirmationV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn executing party, for example, a transfer agent, sends the RedemptionOrderConfirmation message to the instructing party, for example, an investment manager or its authorised representative to confirm the details of execution for a previously received RedemptionOrder message.\r\nUsage\r\nThe RedemptionOrderConfirmation message is used to confirm the execution of one or more individual orders.\r\nA RedemptionOrder message containing more than one individual order may be responded to by more than one RedemptionOrderConfirmation message, as the valuation cycle of the financial instruments in each individual order may be different.\r\nEach individual order confirmation specified is identified in DealReference. The reference of the original individual order is specified in OrderReference. The message identification of the RedemptionOrder message in which the individual order was conveyed may also be quoted in RelatedReference.\r\nWhen the executing party sends several confirmations, there is no specific indication in the message that it is an incomplete confirmation. Reconciliation should be based on the references.\r\nA RedemptionOrder must in all cases be responded to by a RedemptionOrderConfirmation message and in no circumstances by a RedemptionBulkOrderConfirmation message.\r\nIf the executing party needs to confirm a RedemptionBulkOrder message, then a RedemptionBulkOrderConfirmation message must be used."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationV04
 * RedemptionOrderConfirmationV04}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.setr.RedemptionMultipleOrderConfirmationV02
 * RedemptionMultipleOrderConfirmationV02}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RedemptionOrderConfirmationV03", propOrder = {"messageIdentification", "poolReference", "previousReference", "relatedReference", "multipleExecutionDetails", "relatedPartyDetails", "copyDetails", "extension"})
public class RedemptionOrderConfirmationV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgId", required = true)
	protected MessageIdentification1 messageIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference that uniquely identifies a message from a business application standpoint. "
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationV04#mmMessageIdentification
	 * RedemptionOrderConfirmationV04.mmMessageIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessageIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Reference that uniquely identifies a message from a business application standpoint. ";
			nextVersions_lazy = () -> Arrays.asList(RedemptionOrderConfirmationV04.mmMessageIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RedemptionOrderConfirmationV03.class.getMethod("getMessageIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "PoolRef")
	protected AdditionalReference3 poolReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PoolRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collective reference identifying a set of messages."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationV04#mmPoolReference
	 * RedemptionOrderConfirmationV04.mmPoolReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPoolReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "PoolRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolReference";
			definition = "Collective reference identifying a set of messages.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionOrderConfirmationV04.mmPoolReference);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RedemptionOrderConfirmationV03.class.getMethod("getPoolReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "PrvsRef")
	protected List<AdditionalReference3> previousReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference to a linked message that was previously sent."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationV04#mmPreviousReference
	 * RedemptionOrderConfirmationV04.mmPreviousReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPreviousReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "PrvsRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReference";
			definition = "Reference to a linked message that was previously sent.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionOrderConfirmationV04.mmPreviousReference);
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RedemptionOrderConfirmationV03.class.getMethod("getPreviousReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "RltdRef")
	protected AdditionalReference3 relatedReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to a linked message that was previously received."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationV04#mmRelatedReference
	 * RedemptionOrderConfirmationV04.mmRelatedReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRelatedReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "RltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Reference to a linked message that was previously received.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionOrderConfirmationV04.mmRelatedReference);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RedemptionOrderConfirmationV03.class.getMethod("getRelatedReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "MltplExctnDtls", required = true)
	protected RedemptionMultipleExecution3 multipleExecutionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution3
	 * RedemptionMultipleExecution3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MltplExctnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultipleExecutionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "General information related to the execution of investment fund orders."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationV04#mmMultipleExecutionDetails
	 * RedemptionOrderConfirmationV04.mmMultipleExecutionDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMultipleExecutionDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "MltplExctnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultipleExecutionDetails";
			definition = "General information related to the execution of investment fund orders.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionOrderConfirmationV04.mmMultipleExecutionDetails);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> RedemptionMultipleExecution3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RedemptionOrderConfirmationV03.class.getMethod("getMultipleExecutionDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "RltdPtyDtls")
	protected List<Intermediary9> relatedPartyDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Intermediary9
	 * Intermediary9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdPtyDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPartyDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about parties related to the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRelatedPartyDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "RltdPtyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPartyDetails";
			definition = "Information about parties related to the transaction.";
			maxOccurs = 10;
			minOccurs = 0;
			complexType_lazy = () -> Intermediary9.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RedemptionOrderConfirmationV03.class.getMethod("getRelatedPartyDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "CpyDtls")
	protected CopyInformation2 copyDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CopyInformation2
	 * CopyInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CpyDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CopyDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information provided when the message is a copy of a previous message."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationV04#mmCopyDetails
	 * RedemptionOrderConfirmationV04.mmCopyDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCopyDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "CpyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CopyDetails";
			definition = "Information provided when the message is a copy of a previous message.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionOrderConfirmationV04.mmCopyDetails);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CopyInformation2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RedemptionOrderConfirmationV03.class.getMethod("getCopyDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "Xtnsn")
	protected List<Extension1> extension;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Extension1
	 * Extension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Xtnsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Extension"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationV04#mmExtension
	 * RedemptionOrderConfirmationV04.mmExtension}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmExtension = new MMMessageBuildingBlock() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionOrderConfirmationV04.mmExtension);
			minOccurs = 0;
			complexType_lazy = () -> Extension1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RedemptionOrderConfirmationV03.class.getMethod("getExtension", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.forRedemptionOrderConfirmationV03,
						com.tools20022.repository.constraints.ConstraintOrderReferenceRule.forRedemptionOrderConfirmationV03, com.tools20022.repository.constraints.ConstraintRelatedPartiesDetailsRule.forRedemptionOrderConfirmationV03);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RedemptionOrderConfirmationV03";
				definition = "Scope\r\nAn executing party, for example, a transfer agent, sends the RedemptionOrderConfirmation message to the instructing party, for example, an investment manager or its authorised representative to confirm the details of execution for a previously received RedemptionOrder message.\r\nUsage\r\nThe RedemptionOrderConfirmation message is used to confirm the execution of one or more individual orders.\r\nA RedemptionOrder message containing more than one individual order may be responded to by more than one RedemptionOrderConfirmation message, as the valuation cycle of the financial instruments in each individual order may be different.\r\nEach individual order confirmation specified is identified in DealReference. The reference of the original individual order is specified in OrderReference. The message identification of the RedemptionOrder message in which the individual order was conveyed may also be quoted in RelatedReference.\r\nWhen the executing party sends several confirmations, there is no specific indication in the message that it is an incomplete confirmation. Reconciliation should be based on the references.\r\nA RedemptionOrder must in all cases be responded to by a RedemptionOrderConfirmation message and in no circumstances by a RedemptionBulkOrderConfirmation message.\r\nIf the executing party needs to confirm a RedemptionBulkOrder message, then a RedemptionBulkOrderConfirmation message must be used.";
				nextVersions_lazy = () -> Arrays.asList(RedemptionOrderConfirmationV04.mmObject());
				previousVersion_lazy = () -> RedemptionMultipleOrderConfirmationV02.mmObject();
				messageSet_lazy = () -> Arrays.asList(InvestmentFundsISOPreviousversion.mmObject());
				rootElement = "Document";
				xmlTag = "RedOrdrConfV03";
				businessArea_lazy = () -> SecuritiesTradePreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.RedemptionOrderConfirmationV03.mmMessageIdentification, com.tools20022.repository.area.setr.RedemptionOrderConfirmationV03.mmPoolReference,
						com.tools20022.repository.area.setr.RedemptionOrderConfirmationV03.mmPreviousReference, com.tools20022.repository.area.setr.RedemptionOrderConfirmationV03.mmRelatedReference,
						com.tools20022.repository.area.setr.RedemptionOrderConfirmationV03.mmMultipleExecutionDetails, com.tools20022.repository.area.setr.RedemptionOrderConfirmationV03.mmRelatedPartyDetails,
						com.tools20022.repository.area.setr.RedemptionOrderConfirmationV03.mmCopyDetails, com.tools20022.repository.area.setr.RedemptionOrderConfirmationV03.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "setr";
						messageFunctionality = "006";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return RedemptionOrderConfirmationV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public RedemptionOrderConfirmationV03 setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public Optional<AdditionalReference3> getPoolReference() {
		return poolReference == null ? Optional.empty() : Optional.of(poolReference);
	}

	public RedemptionOrderConfirmationV03 setPoolReference(AdditionalReference3 poolReference) {
		this.poolReference = poolReference;
		return this;
	}

	public List<AdditionalReference3> getPreviousReference() {
		return previousReference == null ? previousReference = new ArrayList<>() : previousReference;
	}

	public RedemptionOrderConfirmationV03 setPreviousReference(List<AdditionalReference3> previousReference) {
		this.previousReference = Objects.requireNonNull(previousReference);
		return this;
	}

	public Optional<AdditionalReference3> getRelatedReference() {
		return relatedReference == null ? Optional.empty() : Optional.of(relatedReference);
	}

	public RedemptionOrderConfirmationV03 setRelatedReference(AdditionalReference3 relatedReference) {
		this.relatedReference = relatedReference;
		return this;
	}

	public RedemptionMultipleExecution3 getMultipleExecutionDetails() {
		return multipleExecutionDetails;
	}

	public RedemptionOrderConfirmationV03 setMultipleExecutionDetails(RedemptionMultipleExecution3 multipleExecutionDetails) {
		this.multipleExecutionDetails = Objects.requireNonNull(multipleExecutionDetails);
		return this;
	}

	public List<Intermediary9> getRelatedPartyDetails() {
		return relatedPartyDetails == null ? relatedPartyDetails = new ArrayList<>() : relatedPartyDetails;
	}

	public RedemptionOrderConfirmationV03 setRelatedPartyDetails(List<Intermediary9> relatedPartyDetails) {
		this.relatedPartyDetails = Objects.requireNonNull(relatedPartyDetails);
		return this;
	}

	public Optional<CopyInformation2> getCopyDetails() {
		return copyDetails == null ? Optional.empty() : Optional.of(copyDetails);
	}

	public RedemptionOrderConfirmationV03 setCopyDetails(CopyInformation2 copyDetails) {
		this.copyDetails = copyDetails;
		return this;
	}

	public List<Extension1> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public RedemptionOrderConfirmationV03 setExtension(List<Extension1> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:setr.006.001.03")
	static public class Document {
		@XmlElement(name = "RedOrdrConfV03", required = true)
		public RedemptionOrderConfirmationV03 messageBody;
	}
}