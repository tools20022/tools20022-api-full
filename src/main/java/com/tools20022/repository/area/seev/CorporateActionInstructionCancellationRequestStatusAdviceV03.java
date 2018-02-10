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

package com.tools20022.repository.area.seev;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesEventsArchive;
import com.tools20022.repository.choice.InstructionCancellationRequestStatus5Choice;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.ISOArchive;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An account servicer sends the
 * CorporateActionInstructionCancellationRequestStatusAdvice message to an
 * account owner or its designated agent to report status of a previously
 * received CorporateActionInstructionCancellationRequest message sent by the
 * account owner.<br>
 * This will include the acknowledgement/rejection of a request to cancel an
 * outstanding instruction.<br>
 * <b>Usage</b><br>
 * The message may also be used to:<br>
 * - re-send a message previously sent (the sub-function of the message is
 * Duplicate),<br>
 * - provide a third party with a copy of a message for information (the
 * sub-function of the message is Copy),<br>
 * - re-send to a third party a copy of a message for information (the
 * sub-function of the message is Copy Duplicate),<br>
 * using the relevant elements in the business application header (BAH). ISO
 * 15022 - 20022 COEXISTENCE This ISO 20022 message is reversed engineered from
 * ISO 15022. Both standards will coexist for a certain number of years. Until
 * this coexistence period ends, the usage of certain data types is restricted
 * to ensure interoperability between ISO 15022 and 20022 users. Compliance to
 * these rules is mandatory in a coexistence environment. The coexistence
 * restrictions are described in a Textual Rule linked to the Message Items they
 * concern. These coexistence textual rules are clearly identified as follows:
 * “CoexistenceXxxxRule”.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV03#mmInstructionCancellationRequestIdentification
 * CorporateActionInstructionCancellationRequestStatusAdviceV03.
 * mmInstructionCancellationRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV03#mmOtherDocumentIdentification
 * CorporateActionInstructionCancellationRequestStatusAdviceV03.
 * mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV03#mmCorporateActionGeneralInformation
 * CorporateActionInstructionCancellationRequestStatusAdviceV03.
 * mmCorporateActionGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV03#mmInstructionCancellationRequestStatus
 * CorporateActionInstructionCancellationRequestStatusAdviceV03.
 * mmInstructionCancellationRequestStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV03#mmCorporateActionInstruction
 * CorporateActionInstructionCancellationRequestStatusAdviceV03.
 * mmCorporateActionInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV03#mmAdditionalInformation
 * CorporateActionInstructionCancellationRequestStatusAdviceV03.
 * mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV03#mmSupplementaryData
 * CorporateActionInstructionCancellationRequestStatusAdviceV03.
 * mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "CorpActnInstrCxlReqStsAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesEventsArchive
 * SecuritiesEventsArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.041.001.03}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#forCorporateActionInstructionCancellationRequestStatusAdviceV03
 * ConstraintAdditionalInformationRule.
 * forCorporateActionInstructionCancellationRequestStatusAdviceV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forCorporateActionInstructionCancellationRequestStatusAdviceV03
 * ConstraintCoexistenceCharacterSetXRule.
 * forCorporateActionInstructionCancellationRequestStatusAdviceV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule#forCorporateActionInstructionCancellationRequestStatusAdviceV03
 * ConstraintCoexistenceIdentificationRule.
 * forCorporateActionInstructionCancellationRequestStatusAdviceV03}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionInstructionCancellationRequestStatusAdviceV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account servicer sends the CorporateActionInstructionCancellationRequestStatusAdvice message to an account owner or its designated agent to report status of a previously received CorporateActionInstructionCancellationRequest message sent by the account owner.\r\nThis will include the acknowledgement/rejection of a request to cancel an outstanding instruction.\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent (the sub-function of the message is Duplicate),\r\n- provide a third party with a copy of a message for information (the sub-function of the message is Copy),\r\n- re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate),\r\nusing the relevant elements in the business application header (BAH).\nISO 15022 - 20022 COEXISTENCE\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment.  The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows:  “CoexistenceXxxxRule”."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV04
 * CorporateActionInstructionCancellationRequestStatusAdviceV04}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV02
 * CorporateActionInstructionCancellationRequestStatusAdviceV02}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionInstructionCancellationRequestStatusAdviceV03", propOrder = {"instructionCancellationRequestIdentification", "otherDocumentIdentification", "corporateActionGeneralInformation",
		"instructionCancellationRequestStatus", "corporateActionInstruction", "additionalInformation", "supplementaryData"})
public class CorporateActionInstructionCancellationRequestStatusAdviceV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "InstrCxlReqId")
	protected DocumentIdentification9 instructionCancellationRequestIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification9
	 * DocumentIdentification9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrCxlReqId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionCancellationRequestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a related instruction cancellation request document."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmInstructionCancellationRequestIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "InstrCxlReqId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionCancellationRequestIdentification";
			definition = "Identification of a related instruction cancellation request document.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification9.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionInstructionCancellationRequestStatusAdviceV03.class.getMethod("getInstructionCancellationRequestIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "OthrDocId")
	protected List<DocumentIdentification14> otherDocumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification14
	 * DocumentIdentification14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrDocId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherDocumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of other documents as well as the document number."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOtherDocumentIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "OthrDocId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherDocumentIdentification";
			definition = "Identification of other documents as well as the document number.";
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification14.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionInstructionCancellationRequestStatusAdviceV03.class.getMethod("getOtherDocumentIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "CorpActnGnlInf", required = true)
	protected CorporateActionGeneralInformation34 corporateActionGeneralInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation34
	 * CorporateActionGeneralInformation34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnGnlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionGeneralInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "General information about the corporate action event."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCorporateActionGeneralInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "CorpActnGnlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionGeneralInformation";
			definition = "General information about the corporate action event.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionGeneralInformation34.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionInstructionCancellationRequestStatusAdviceV03.class.getMethod("getCorporateActionGeneralInformation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "InstrCxlReqSts", required = true)
	protected List<InstructionCancellationRequestStatus5Choice> instructionCancellationRequestStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.InstructionCancellationRequestStatus5Choice
	 * InstructionCancellationRequestStatus5Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrCxlReqSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionCancellationRequestStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the processing status of the instruction cancellation request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmInstructionCancellationRequestStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "InstrCxlReqSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionCancellationRequestStatus";
			definition = "Provides information about the processing status of the instruction cancellation request.";
			minOccurs = 1;
			complexType_lazy = () -> InstructionCancellationRequestStatus5Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionInstructionCancellationRequestStatusAdviceV03.class.getMethod("getInstructionCancellationRequestStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "CorpActnInstr")
	protected CorporateActionOption41 corporateActionInstruction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption41
	 * CorporateActionOption41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnInstr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about the corporate action option."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCorporateActionInstruction = new MMMessageBuildingBlock() {
		{
			xmlTag = "CorpActnInstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionInstruction";
			definition = "Information about the corporate action option.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionOption41.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionInstructionCancellationRequestStatusAdviceV03.class.getMethod("getCorporateActionInstruction", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "AddtlInf")
	protected CorporateActionNarrative10 additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative10
	 * CorporateActionNarrative10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides additional information."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAdditionalInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Provides additional information.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionNarrative10.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionInstructionCancellationRequestStatusAdviceV03.class.getMethod("getAdditionalInformation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that can not be captured in the structured fields and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionInstructionCancellationRequestStatusAdviceV03.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.forCorporateActionInstructionCancellationRequestStatusAdviceV03,
						com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forCorporateActionInstructionCancellationRequestStatusAdviceV03,
						com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule.forCorporateActionInstructionCancellationRequestStatusAdviceV03);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionInstructionCancellationRequestStatusAdviceV03";
				definition = "Scope\r\nAn account servicer sends the CorporateActionInstructionCancellationRequestStatusAdvice message to an account owner or its designated agent to report status of a previously received CorporateActionInstructionCancellationRequest message sent by the account owner.\r\nThis will include the acknowledgement/rejection of a request to cancel an outstanding instruction.\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent (the sub-function of the message is Duplicate),\r\n- provide a third party with a copy of a message for information (the sub-function of the message is Copy),\r\n- re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate),\r\nusing the relevant elements in the business application header (BAH).\nISO 15022 - 20022 COEXISTENCE\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment.  The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows:  “CoexistenceXxxxRule”.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionInstructionCancellationRequestStatusAdviceV04.mmObject());
				previousVersion_lazy = () -> CorporateActionInstructionCancellationRequestStatusAdviceV02.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "CorpActnInstrCxlReqStsAdvc";
				businessArea_lazy = () -> SecuritiesEventsArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV03.mmInstructionCancellationRequestIdentification,
						com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV03.mmOtherDocumentIdentification,
						com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV03.mmCorporateActionGeneralInformation,
						com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV03.mmInstructionCancellationRequestStatus,
						com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV03.mmCorporateActionInstruction,
						com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV03.mmAdditionalInformation,
						com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV03.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "041";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CorporateActionInstructionCancellationRequestStatusAdviceV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<DocumentIdentification9> getInstructionCancellationRequestIdentification() {
		return instructionCancellationRequestIdentification == null ? Optional.empty() : Optional.of(instructionCancellationRequestIdentification);
	}

	public CorporateActionInstructionCancellationRequestStatusAdviceV03 setInstructionCancellationRequestIdentification(DocumentIdentification9 instructionCancellationRequestIdentification) {
		this.instructionCancellationRequestIdentification = instructionCancellationRequestIdentification;
		return this;
	}

	public List<DocumentIdentification14> getOtherDocumentIdentification() {
		return otherDocumentIdentification == null ? otherDocumentIdentification = new ArrayList<>() : otherDocumentIdentification;
	}

	public CorporateActionInstructionCancellationRequestStatusAdviceV03 setOtherDocumentIdentification(List<DocumentIdentification14> otherDocumentIdentification) {
		this.otherDocumentIdentification = Objects.requireNonNull(otherDocumentIdentification);
		return this;
	}

	public CorporateActionGeneralInformation34 getCorporateActionGeneralInformation() {
		return corporateActionGeneralInformation;
	}

	public CorporateActionInstructionCancellationRequestStatusAdviceV03 setCorporateActionGeneralInformation(CorporateActionGeneralInformation34 corporateActionGeneralInformation) {
		this.corporateActionGeneralInformation = Objects.requireNonNull(corporateActionGeneralInformation);
		return this;
	}

	public List<InstructionCancellationRequestStatus5Choice> getInstructionCancellationRequestStatus() {
		return instructionCancellationRequestStatus == null ? instructionCancellationRequestStatus = new ArrayList<>() : instructionCancellationRequestStatus;
	}

	public CorporateActionInstructionCancellationRequestStatusAdviceV03 setInstructionCancellationRequestStatus(List<InstructionCancellationRequestStatus5Choice> instructionCancellationRequestStatus) {
		this.instructionCancellationRequestStatus = Objects.requireNonNull(instructionCancellationRequestStatus);
		return this;
	}

	public Optional<CorporateActionOption41> getCorporateActionInstruction() {
		return corporateActionInstruction == null ? Optional.empty() : Optional.of(corporateActionInstruction);
	}

	public CorporateActionInstructionCancellationRequestStatusAdviceV03 setCorporateActionInstruction(CorporateActionOption41 corporateActionInstruction) {
		this.corporateActionInstruction = corporateActionInstruction;
		return this;
	}

	public Optional<CorporateActionNarrative10> getAdditionalInformation() {
		return additionalInformation == null ? Optional.empty() : Optional.of(additionalInformation);
	}

	public CorporateActionInstructionCancellationRequestStatusAdviceV03 setAdditionalInformation(CorporateActionNarrative10 additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public CorporateActionInstructionCancellationRequestStatusAdviceV03 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.041.001.03")
	static public class Document {
		@XmlElement(name = "CorpActnInstrCxlReqStsAdvc", required = true)
		public CorporateActionInstructionCancellationRequestStatusAdviceV03 messageBody;
	}
}