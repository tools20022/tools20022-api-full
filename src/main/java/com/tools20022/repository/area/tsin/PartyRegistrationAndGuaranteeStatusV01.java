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

package com.tools20022.repository.area.tsin;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.TradeServicesInitiationLatestVersion;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.Max15NumericText;
import com.tools20022.repository.msg.BusinessLetter1;
import com.tools20022.repository.msg.EncapsulatedBusinessMessage1;
import com.tools20022.repository.msg.FinancingAgreementList1;
import com.tools20022.repository.msgset.FactoringServicesISOLatestversion;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * The message PartyRegistrationAndGuaranteeStatus is either sent by a factoring
 * service to a financing client to indicate the status of a factoring service
 * agreement or from a guarantee issuer to a factoring client or a factoring
 * service to indicate the guarantee covering a requested factoring service
 * agreement. The message can also be sent to an interested party.<br>
 * The factoring service or guarantee issuer may include references to a
 * corresponding PartyRegistrationAndGuaranteeRequest message or other related
 * messages and may include referenced data.<br>
 * The message contains information about other parties to be notified about the
 * financial service agreement or the guarantee and whether these parties are
 * required to acknowledge the agreement.<br>
 * The message contains information returned by the financial institution
 * indicating acceptance or rejection of the trade partner; a positive response
 * is necessary before being able to assign financial items concerning the trade
 * party.<br>
 * This message contains identifications of cash accounts to enable payer and
 * payee to treat the transferred payment obligations.<br>
 * The message can carry digital signatures if required by context.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TradeServicesInitiationLatestVersion
 * TradeServicesInitiationLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.FactoringServicesISOLatestversion
 * FactoringServicesISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "PtyRegnAndGrntSts"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeStatusV01#mmHeader
 * PartyRegistrationAndGuaranteeStatusV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeStatusV01#mmAgreementList
 * PartyRegistrationAndGuaranteeStatusV01.mmAgreementList}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeStatusV01#mmAgreementCount
 * PartyRegistrationAndGuaranteeStatusV01.mmAgreementCount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeStatusV01#mmItemCount
 * PartyRegistrationAndGuaranteeStatusV01.mmItemCount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeStatusV01#mmControlSum
 * PartyRegistrationAndGuaranteeStatusV01.mmControlSum}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeStatusV01#mmAttachedMessage
 * PartyRegistrationAndGuaranteeStatusV01.mmAttachedMessage}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code tsin.010.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PartyRegistrationAndGuaranteeStatusV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The message PartyRegistrationAndGuaranteeStatus is either sent by a factoring service to a financing client to indicate the status of a factoring service agreement or from a guarantee issuer to a factoring client or a factoring service to indicate the guarantee covering a requested factoring service agreement. The message can also be sent to an interested party.\r\nThe factoring service or guarantee issuer may include references to a corresponding PartyRegistrationAndGuaranteeRequest message or other related messages and may include referenced data.\r\nThe message contains information about other parties to be notified about the financial service agreement or the guarantee and whether these parties are required to acknowledge the agreement.\r\nThe message contains information returned by the financial institution indicating acceptance or rejection of the trade partner; a positive response is necessary before being able to assign financial items concerning the trade party.\r\nThis message contains identifications of cash accounts to enable payer and payee to treat the transferred payment obligations.\r\nThe message can carry digital signatures if required by context."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PartyRegistrationAndGuaranteeStatusV01", propOrder = {"header", "agreementList", "agreementCount", "itemCount", "controlSum", "attachedMessage"})
public class PartyRegistrationAndGuaranteeStatusV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected BusinessLetter1 header;
	/**
	 * Set of characteristics that unambiguously identify the status, common
	 * parameters, documents and identifications.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.BusinessLetter1
	 * BusinessLetter1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Hdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Header"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of characteristics that unambiguously identify the status, common parameters, documents and identifications."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Set of characteristics that unambiguously identify the status, common parameters, documents and identifications.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> BusinessLetter1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PartyRegistrationAndGuaranteeStatusV01.class.getMethod("getHeader", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<FinancingAgreementList1> agreementList;
	/**
	 * List of agreements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancingAgreementList1
	 * FinancingAgreementList1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgrmtList"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgreementList"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "List of agreements."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAgreementList = new MMMessageBuildingBlock() {
		{
			xmlTag = "AgrmtList";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgreementList";
			definition = "List of agreements.";
			minOccurs = 1;
			complexType_lazy = () -> FinancingAgreementList1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PartyRegistrationAndGuaranteeStatusV01.class.getMethod("getAgreementList", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max15NumericText agreementCount;
	/**
	 * Number of agreement lists as control value.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15NumericText
	 * Max15NumericText}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgrmtCnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgreementCount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of agreement lists as control value."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAgreementCount = new MMMessageBuildingBlock() {
		{
			xmlTag = "AgrmtCnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgreementCount";
			definition = "Number of agreement lists as control value.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PartyRegistrationAndGuaranteeStatusV01.class.getMethod("getAgreementCount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max15NumericText itemCount;
	/**
	 * Total number of individual items in all lists.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15NumericText
	 * Max15NumericText}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ItmCnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ItemCount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total number of individual items in all lists."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmItemCount = new MMMessageBuildingBlock() {
		{
			xmlTag = "ItmCnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ItemCount";
			definition = "Total number of individual items in all lists.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PartyRegistrationAndGuaranteeStatusV01.class.getMethod("getItemCount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DecimalNumber controlSum;
	/**
	 * Total of all individual amounts included in all lists, irrespective of
	 * currencies or direction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrlSum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ControlSum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total of all individual amounts included in all lists, irrespective of currencies or direction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmControlSum = new MMMessageBuildingBlock() {
		{
			xmlTag = "CtrlSum";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ControlSum";
			definition = "Total of all individual amounts included in all lists, irrespective of currencies or direction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PartyRegistrationAndGuaranteeStatusV01.class.getMethod("getControlSum", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<EncapsulatedBusinessMessage1> attachedMessage;
	/**
	 * Referenced or related business message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.EncapsulatedBusinessMessage1
	 * EncapsulatedBusinessMessage1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AttchdMsg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AttachedMessage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Referenced or related business message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAttachedMessage = new MMMessageBuildingBlock() {
		{
			xmlTag = "AttchdMsg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttachedMessage";
			definition = "Referenced or related business message.";
			minOccurs = 0;
			complexType_lazy = () -> EncapsulatedBusinessMessage1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PartyRegistrationAndGuaranteeStatusV01.class.getMethod("getAttachedMessage", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartyRegistrationAndGuaranteeStatusV01";
				definition = "The message PartyRegistrationAndGuaranteeStatus is either sent by a factoring service to a financing client to indicate the status of a factoring service agreement or from a guarantee issuer to a factoring client or a factoring service to indicate the guarantee covering a requested factoring service agreement. The message can also be sent to an interested party.\r\nThe factoring service or guarantee issuer may include references to a corresponding PartyRegistrationAndGuaranteeRequest message or other related messages and may include referenced data.\r\nThe message contains information about other parties to be notified about the financial service agreement or the guarantee and whether these parties are required to acknowledge the agreement.\r\nThe message contains information returned by the financial institution indicating acceptance or rejection of the trade partner; a positive response is necessary before being able to assign financial items concerning the trade party.\r\nThis message contains identifications of cash accounts to enable payer and payee to treat the transferred payment obligations.\r\nThe message can carry digital signatures if required by context.";
				messageSet_lazy = () -> Arrays.asList(FactoringServicesISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "PtyRegnAndGrntSts";
				businessArea_lazy = () -> TradeServicesInitiationLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeStatusV01.mmHeader,
						com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeStatusV01.mmAgreementList, com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeStatusV01.mmAgreementCount,
						com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeStatusV01.mmItemCount, com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeStatusV01.mmControlSum,
						com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeStatusV01.mmAttachedMessage);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "tsin";
						messageFunctionality = "010";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return PartyRegistrationAndGuaranteeStatusV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Hdr", required = true)
	public BusinessLetter1 getHeader() {
		return header;
	}

	public void setHeader(BusinessLetter1 header) {
		this.header = header;
	}

	@XmlElement(name = "AgrmtList", required = true)
	public List<FinancingAgreementList1> getAgreementList() {
		return agreementList;
	}

	public void setAgreementList(List<FinancingAgreementList1> agreementList) {
		this.agreementList = agreementList;
	}

	@XmlElement(name = "AgrmtCnt")
	public Max15NumericText getAgreementCount() {
		return agreementCount;
	}

	public void setAgreementCount(Max15NumericText agreementCount) {
		this.agreementCount = agreementCount;
	}

	@XmlElement(name = "ItmCnt")
	public Max15NumericText getItemCount() {
		return itemCount;
	}

	public void setItemCount(Max15NumericText itemCount) {
		this.itemCount = itemCount;
	}

	@XmlElement(name = "CtrlSum")
	public DecimalNumber getControlSum() {
		return controlSum;
	}

	public void setControlSum(DecimalNumber controlSum) {
		this.controlSum = controlSum;
	}

	@XmlElement(name = "AttchdMsg")
	public List<EncapsulatedBusinessMessage1> getAttachedMessage() {
		return attachedMessage;
	}

	public void setAttachedMessage(List<EncapsulatedBusinessMessage1> attachedMessage) {
		this.attachedMessage = attachedMessage;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:tsin.010.01.01")
	static public class Document {
		@XmlElement(name = "PtyRegnAndGrntSts", required = true)
		public PartyRegistrationAndGuaranteeStatusV01 messageBody;
	}
}