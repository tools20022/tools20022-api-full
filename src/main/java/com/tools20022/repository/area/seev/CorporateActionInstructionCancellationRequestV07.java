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
import com.tools20022.repository.area.SecuritiesEventsLatestVersion;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.CorporateActionsISOLatestversion;
import com.tools20022.repository.msgset.CorporateActionsMaintenance20162017;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An account owner sends the CorporateActionInstructionCancellationRequest
 * message to an account servicer to request cancellation of a previously sent
 * corporate action election instruction.<br>
 * <b>Usage</b><br>
 * The message may also be used to:<br>
 * - re-send a message previously sent (the sub-function of the message is
 * Duplicate),<br>
 * - provide a third party with a copy of a message for information (the
 * sub-function of the message is Copy),<br>
 * - re-send to a third party a copy of a message for information (the
 * sub-function of the message is Copy Duplicate),<br>
 * using the relevant elements in the business application header (BAH).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesEventsLatestVersion
 * SecuritiesEventsLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.CorporateActionsISOLatestversion
 * CorporateActionsISOLatestversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.CorporateActionsMaintenance20162017
 * CorporateActionsMaintenance20162017}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "CorpActnInstrCxlReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV07#mmChangeInstructionIndicator
 * CorporateActionInstructionCancellationRequestV07.mmChangeInstructionIndicator
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV07#mmInstructionIdentification
 * CorporateActionInstructionCancellationRequestV07.mmInstructionIdentification}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV07#mmCorporateActionGeneralInformation
 * CorporateActionInstructionCancellationRequestV07.
 * mmCorporateActionGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV07#mmAccountDetails
 * CorporateActionInstructionCancellationRequestV07.mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV07#mmCorporateActionInstruction
 * CorporateActionInstructionCancellationRequestV07.mmCorporateActionInstruction
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV07#mmSupplementaryData
 * CorporateActionInstructionCancellationRequestV07.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.040.001.07}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionInstructionCancellationRequestV07"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account owner sends the CorporateActionInstructionCancellationRequest message to an account servicer to request cancellation of a previously sent corporate action election instruction.\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent (the sub-function of the message is Duplicate),\r\n- provide a third party with a copy of a message for information (the sub-function of the message is Copy),\r\n- re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate),\r\nusing the relevant elements in the business application header (BAH)."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV06
 * CorporateActionInstructionCancellationRequestV06}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateActionInstructionCancellationRequestV07", propOrder = {"changeInstructionIndicator", "instructionIdentification", "corporateActionGeneralInformation", "accountDetails", "corporateActionInstruction",
		"supplementaryData"})
public class CorporateActionInstructionCancellationRequestV07 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected YesNoIndicator changeInstructionIndicator;
	/**
	 * When used in a corporate action instruction, indicates that the current
	 * instruction is replacing a previous one that was cancelled earlier. When
	 * used in a corporate action instruction cancellation request, indicates
	 * that cancelled instruction will be replaced by a new corporate action
	 * instruction to be sent later.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChngInstrInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeInstructionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When used in a corporate action instruction, indicates that the current instruction is replacing a previous one that was cancelled earlier. When used in a corporate action instruction cancellation request, indicates that cancelled instruction will be replaced by a new corporate action instruction to be sent later."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV06#mmChangeInstructionIndicator
	 * CorporateActionInstructionCancellationRequestV06.
	 * mmChangeInstructionIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmChangeInstructionIndicator = new MMMessageBuildingBlock() {
		{
			xmlTag = "ChngInstrInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeInstructionIndicator";
			definition = "When used in a corporate action instruction, indicates that the current instruction is replacing a previous one that was cancelled earlier. When used in a corporate action instruction cancellation request, indicates that cancelled instruction will be replaced by a new corporate action instruction to be sent later.";
			previousVersion_lazy = () -> CorporateActionInstructionCancellationRequestV06.mmChangeInstructionIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionInstructionCancellationRequestV07.class.getMethod("getChangeInstructionIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DocumentIdentification31 instructionIdentification;
	/**
	 * Identification of a previously sent instruction document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification31
	 * DocumentIdentification31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a previously sent instruction document."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV06#mmInstructionIdentification
	 * CorporateActionInstructionCancellationRequestV06.
	 * mmInstructionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmInstructionIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "InstrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionIdentification";
			definition = "Identification of a previously sent instruction document.";
			previousVersion_lazy = () -> CorporateActionInstructionCancellationRequestV06.mmInstructionIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification31.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionInstructionCancellationRequestV07.class.getMethod("getInstructionIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CorporateActionGeneralInformation110 corporateActionGeneralInformation;
	/**
	 * General information about the corporate action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation110
	 * CorporateActionGeneralInformation110}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV06#mmCorporateActionGeneralInformation
	 * CorporateActionInstructionCancellationRequestV06.
	 * mmCorporateActionGeneralInformation}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCorporateActionGeneralInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "CorpActnGnlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionGeneralInformation";
			definition = "General information about the corporate action event.";
			previousVersion_lazy = () -> CorporateActionInstructionCancellationRequestV06.mmCorporateActionGeneralInformation;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionGeneralInformation110.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionInstructionCancellationRequestV07.class.getMethod("getCorporateActionGeneralInformation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AccountIdentification31 accountDetails;
	/**
	 * General information about the safekeeping account and the account owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentification31
	 * AccountIdentification31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "General information about the safekeeping account and the account owner."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV06#mmAccountDetails
	 * CorporateActionInstructionCancellationRequestV06.mmAccountDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAccountDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "AcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountDetails";
			definition = "General information about the safekeeping account and the account owner.";
			previousVersion_lazy = () -> CorporateActionInstructionCancellationRequestV06.mmAccountDetails;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountIdentification31.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionInstructionCancellationRequestV07.class.getMethod("getAccountDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CorporateActionOption120 corporateActionInstruction;
	/**
	 * Information about the corporate action option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption120
	 * CorporateActionOption120}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV06#mmCorporateActionInstruction
	 * CorporateActionInstructionCancellationRequestV06.
	 * mmCorporateActionInstruction}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCorporateActionInstruction = new MMMessageBuildingBlock() {
		{
			xmlTag = "CorpActnInstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionInstruction";
			definition = "Information about the corporate action option.";
			previousVersion_lazy = () -> CorporateActionInstructionCancellationRequestV06.mmCorporateActionInstruction;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionOption120.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionInstructionCancellationRequestV07.class.getMethod("getCorporateActionInstruction", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * Additional information that can not be captured in the structured fields
	 * and/or any other specific block.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV06#mmSupplementaryData
	 * CorporateActionInstructionCancellationRequestV06.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			previousVersion_lazy = () -> CorporateActionInstructionCancellationRequestV06.mmSupplementaryData;
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionInstructionCancellationRequestV07.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionInstructionCancellationRequestV07";
				definition = "Scope\r\nAn account owner sends the CorporateActionInstructionCancellationRequest message to an account servicer to request cancellation of a previously sent corporate action election instruction.\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent (the sub-function of the message is Duplicate),\r\n- provide a third party with a copy of a message for information (the sub-function of the message is Copy),\r\n- re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate),\r\nusing the relevant elements in the business application header (BAH).";
				previousVersion_lazy = () -> CorporateActionInstructionCancellationRequestV06.mmObject();
				messageSet_lazy = () -> Arrays.asList(CorporateActionsISOLatestversion.mmObject(), CorporateActionsMaintenance20162017.mmObject());
				rootElement = "Document";
				xmlTag = "CorpActnInstrCxlReq";
				businessArea_lazy = () -> SecuritiesEventsLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV07.mmChangeInstructionIndicator,
						com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV07.mmInstructionIdentification,
						com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV07.mmCorporateActionGeneralInformation,
						com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV07.mmAccountDetails,
						com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV07.mmCorporateActionInstruction,
						com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestV07.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "040";
						version = "07";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CorporateActionInstructionCancellationRequestV07.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "ChngInstrInd")
	public YesNoIndicator getChangeInstructionIndicator() {
		return changeInstructionIndicator;
	}

	public void setChangeInstructionIndicator(YesNoIndicator changeInstructionIndicator) {
		this.changeInstructionIndicator = changeInstructionIndicator;
	}

	@XmlElement(name = "InstrId", required = true)
	public DocumentIdentification31 getInstructionIdentification() {
		return instructionIdentification;
	}

	public void setInstructionIdentification(DocumentIdentification31 instructionIdentification) {
		this.instructionIdentification = instructionIdentification;
	}

	@XmlElement(name = "CorpActnGnlInf", required = true)
	public CorporateActionGeneralInformation110 getCorporateActionGeneralInformation() {
		return corporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(CorporateActionGeneralInformation110 corporateActionGeneralInformation) {
		this.corporateActionGeneralInformation = corporateActionGeneralInformation;
	}

	@XmlElement(name = "AcctDtls", required = true)
	public AccountIdentification31 getAccountDetails() {
		return accountDetails;
	}

	public void setAccountDetails(AccountIdentification31 accountDetails) {
		this.accountDetails = accountDetails;
	}

	@XmlElement(name = "CorpActnInstr", required = true)
	public CorporateActionOption120 getCorporateActionInstruction() {
		return corporateActionInstruction;
	}

	public void setCorporateActionInstruction(CorporateActionOption120 corporateActionInstruction) {
		this.corporateActionInstruction = corporateActionInstruction;
	}

	@XmlElement(name = "SplmtryData")
	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:seev.040.07.07")
	static public class Document {
		@XmlElement(name = "CorpActnInstrCxlReq", required = true)
		public CorporateActionInstructionCancellationRequestV07 messageBody;
	}
}