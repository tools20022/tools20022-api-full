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
import com.tools20022.repository.area.SecuritiesSettlementLatestversionsubsetvariant;
import com.tools20022.repository.choice.ProcessingStatus58Choice;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.SettlementAndReconciliationISO15022VariantsISOLatestversion;
import com.tools20022.repository.msgset.SettlementAndReconciliationISO15022VariantsISOPreviousversion;
import com.tools20022.repository.msgset.SettlementandReconciliationMaintenance20162017ISO15022Variants;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An account servicer sends a
 * SecuritiesSettlementConditionsModificationStatusAdvice to an account owner to
 * advise the status of a modification request previously instructed by the
 * account owner.<br>
 * The account servicer/owner relationship may be:<br>
 * - a central securities depository or another settlement market infrastructure
 * acting on behalf of their participants<br>
 * - an agent (sub-custodian) acting on behalf of their global custodian
 * customer, or<br>
 * - a custodian acting on behalf of an investment management institution or a
 * broker/dealer.<br>
 * <br>
 * <b>Usage</b><br>
 * A SecuritiesSettlementConditionsModificationRequest may contain requests on
 * multiple transactions. However, one
 * SecuritiesSettlementConditionsModificationStatusAdvice must be sent per
 * transaction modified unless the
 * SecuritiesSettlementConditionsModificationRequest is rejected as a whole.<br>
 * The message may also be used to:<br>
 * - re-send a message previously sent,<br>
 * - provide a third party with a copy of a message for information,<br>
 * - re-send to a third party a copy of a message for information<br>
 * using the relevant elements in the Business Application Header.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesSettlementLatestversionsubsetvariant
 * SecuritiesSettlementLatestversionsubsetvariant}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.SettlementAndReconciliationISO15022VariantsISOLatestversion
 * SettlementAndReconciliationISO15022VariantsISOLatestversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.SettlementandReconciliationMaintenance20162017ISO15022Variants
 * SettlementandReconciliationMaintenance20162017ISO15022Variants}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.SettlementAndReconciliationISO15022VariantsISOPreviousversion
 * SettlementAndReconciliationISO15022VariantsISOPreviousversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "SctiesSttlmCondModStsAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdvice002V07#mmRequestReference
 * SecuritiesSettlementConditionModificationStatusAdvice002V07.
 * mmRequestReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdvice002V07#mmAccountOwner
 * SecuritiesSettlementConditionModificationStatusAdvice002V07.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdvice002V07#mmSafekeepingAccount
 * SecuritiesSettlementConditionModificationStatusAdvice002V07.
 * mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdvice002V07#mmRequestDetails
 * SecuritiesSettlementConditionModificationStatusAdvice002V07.mmRequestDetails}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdvice002V07#mmProcessingStatus
 * SecuritiesSettlementConditionModificationStatusAdvice002V07.
 * mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdvice002V07#mmSupplementaryData
 * SecuritiesSettlementConditionModificationStatusAdvice002V07.
 * mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code sese.031.002.07}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesSettlementConditionModificationStatusAdvice002V07"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account servicer sends a SecuritiesSettlementConditionsModificationStatusAdvice to an account owner to advise the status of a modification request previously instructed by the account owner.\r\nThe account servicer/owner relationship may be:\r\n- a central securities depository or another settlement market infrastructure acting on behalf of their participants\r\n- an agent (sub-custodian) acting on behalf of their global custodian customer, or\r\n- a custodian acting on behalf of an investment management institution or a broker/dealer.\r\n\r\nUsage\r\nA SecuritiesSettlementConditionsModificationRequest may contain requests on multiple transactions. However, one SecuritiesSettlementConditionsModificationStatusAdvice must be sent per transaction modified unless the SecuritiesSettlementConditionsModificationRequest is rejected as a whole.\r\nThe message may also be used to:\r\n- re-send a message previously sent,\r\n- provide a third party with a copy of a message for information,\r\n- re-send to a third party a copy of a message for information\r\nusing the relevant elements in the Business Application Header."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SecuritiesSettlementConditionModificationStatusAdvice002V07", propOrder = {"requestReference", "accountOwner", "safekeepingAccount", "requestDetails", "processingStatus", "supplementaryData"})
public class SecuritiesSettlementConditionModificationStatusAdvice002V07 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected Identification16 requestReference;
	/**
	 * Identification of the SecuritiesSettlementConditionsModificationRequest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.Identification16
	 * Identification16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the SecuritiesSettlementConditionsModificationRequest."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRequestReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "ReqRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestReference";
			definition = "Identification of the SecuritiesSettlementConditionsModificationRequest.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Identification16.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementConditionModificationStatusAdvice002V07.class.getMethod("getRequestReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PartyIdentification109 accountOwner;
	/**
	 * Party that legally owns the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification109
	 * PartyIdentification109}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that legally owns the account."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAccountOwner = new MMMessageBuildingBlock() {
		{
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that legally owns the account.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification109.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementConditionModificationStatusAdvice002V07.class.getMethod("getAccountOwner", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesAccount30 safekeepingAccount;
	/**
	 * Account to or from which a securities entry is made.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount30
	 * SecuritiesAccount30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to or from which a securities entry is made."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSafekeepingAccount = new MMMessageBuildingBlock() {
		{
			xmlTag = "SfkpgAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount";
			definition = "Account to or from which a securities entry is made.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SecuritiesAccount30.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementConditionModificationStatusAdvice002V07.class.getMethod("getSafekeepingAccount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected RequestDetails16 requestDetails;
	/**
	 * Details of the request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.RequestDetails16
	 * RequestDetails16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the request."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRequestDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "ReqDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestDetails";
			definition = "Details of the request.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RequestDetails16.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementConditionModificationStatusAdvice002V07.class.getMethod("getRequestDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ProcessingStatus58Choice processingStatus;
	/**
	 * Provides details on the processing status of the request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus58Choice
	 * ProcessingStatus58Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details on the processing status of the request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmProcessingStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "PrcgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingStatus";
			definition = "Provides details on the processing status of the request.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ProcessingStatus58Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementConditionModificationStatusAdvice002V07.class.getMethod("getProcessingStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * Additional information that cannot be captured in the structured elements
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
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementConditionModificationStatusAdvice002V07.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesSettlementConditionModificationStatusAdvice002V07";
				definition = "Scope\r\nAn account servicer sends a SecuritiesSettlementConditionsModificationStatusAdvice to an account owner to advise the status of a modification request previously instructed by the account owner.\r\nThe account servicer/owner relationship may be:\r\n- a central securities depository or another settlement market infrastructure acting on behalf of their participants\r\n- an agent (sub-custodian) acting on behalf of their global custodian customer, or\r\n- a custodian acting on behalf of an investment management institution or a broker/dealer.\r\n\r\nUsage\r\nA SecuritiesSettlementConditionsModificationRequest may contain requests on multiple transactions. However, one SecuritiesSettlementConditionsModificationStatusAdvice must be sent per transaction modified unless the SecuritiesSettlementConditionsModificationRequest is rejected as a whole.\r\nThe message may also be used to:\r\n- re-send a message previously sent,\r\n- provide a third party with a copy of a message for information,\r\n- re-send to a third party a copy of a message for information\r\nusing the relevant elements in the Business Application Header.";
				messageSet_lazy = () -> Arrays.asList(SettlementAndReconciliationISO15022VariantsISOLatestversion.mmObject(), SettlementandReconciliationMaintenance20162017ISO15022Variants.mmObject(),
						SettlementAndReconciliationISO15022VariantsISOPreviousversion.mmObject());
				rootElement = "Document";
				xmlTag = "SctiesSttlmCondModStsAdvc";
				businessArea_lazy = () -> SecuritiesSettlementLatestversionsubsetvariant.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdvice002V07.mmRequestReference,
						com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdvice002V07.mmAccountOwner,
						com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdvice002V07.mmSafekeepingAccount,
						com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdvice002V07.mmRequestDetails,
						com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdvice002V07.mmProcessingStatus,
						com.tools20022.repository.area.sese.SecuritiesSettlementConditionModificationStatusAdvice002V07.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "sese";
						messageFunctionality = "031";
						version = "07";
						flavour = "002";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesSettlementConditionModificationStatusAdvice002V07.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "ReqRef", required = true)
	public Identification16 getRequestReference() {
		return requestReference;
	}

	public void setRequestReference(Identification16 requestReference) {
		this.requestReference = requestReference;
	}

	@XmlElement(name = "AcctOwnr")
	public PartyIdentification109 getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(PartyIdentification109 accountOwner) {
		this.accountOwner = accountOwner;
	}

	@XmlElement(name = "SfkpgAcct")
	public SecuritiesAccount30 getSafekeepingAccount() {
		return safekeepingAccount;
	}

	public void setSafekeepingAccount(SecuritiesAccount30 safekeepingAccount) {
		this.safekeepingAccount = safekeepingAccount;
	}

	@XmlElement(name = "ReqDtls")
	public RequestDetails16 getRequestDetails() {
		return requestDetails;
	}

	public void setRequestDetails(RequestDetails16 requestDetails) {
		this.requestDetails = requestDetails;
	}

	@XmlElement(name = "PrcgSts", required = true)
	public ProcessingStatus58Choice getProcessingStatus() {
		return processingStatus;
	}

	public void setProcessingStatus(ProcessingStatus58Choice processingStatus) {
		this.processingStatus = processingStatus;
	}

	@XmlElement(name = "SplmtryData")
	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:sese.031.07.07")
	static public class Document {
		@XmlElement(name = "SctiesSttlmCondModStsAdvc", required = true)
		public SecuritiesSettlementConditionModificationStatusAdvice002V07 messageBody;
	}
}