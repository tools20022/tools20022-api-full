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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code;
import com.tools20022.repository.codeset.DTCCSubEventType1Code;
import com.tools20022.repository.codeset.ExtendedEventType1Code;
import com.tools20022.repository.datatype.Exact5NumericText;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max4AlphaNumericText;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides additional information regarding corporate action general
 * information details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationExtension3#mmPlaceAndName
 * CorporateActionGeneralInformationExtension3.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationExtension3#mmEventType
 * CorporateActionGeneralInformationExtension3.mmEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationExtension3#mmSubEventType
 * CorporateActionGeneralInformationExtension3.mmSubEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationExtension3#mmTransactionCategory
 * CorporateActionGeneralInformationExtension3.mmTransactionCategory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationExtension3#mmReasonCode
 * CorporateActionGeneralInformationExtension3.mmReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationExtension3#mmDTCReasonCode
 * CorporateActionGeneralInformationExtension3.mmDTCReasonCode}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionGeneralInformationExtension3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action general information details."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateActionGeneralInformationExtension3", propOrder = {"placeAndName", "eventType", "subEventType", "transactionCategory", "reasonCode", "DTCReasonCode"})
public class CorporateActionGeneralInformationExtension3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max350Text placeAndName;
	/**
	 * xPath to the element that is being extended.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationExtension3
	 * CorporateActionGeneralInformationExtension3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "xPath to the element that is being extended."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionGeneralInformationExtension3.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected ExtendedEventType1Code eventType;
	/**
	 * DTCC (The Depository Trust and Clearing Corporation) native corporate
	 * action event type name. Used in place for the events that cannot be
	 * classified by ISO Code and are marked as OTHR. Can be used in combination
	 * with DTCC sub event type (when provided) to identify the event. For an
	 * example: a distribution based on recapitalisation event will be presented
	 * as event type: OTHR in standard message. DTCC native event type would be
	 * Distribution (DIST) and DTCC sub event type would be Recapitalisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedEventType1Code
	 * ExtendedEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationExtension3
	 * CorporateActionGeneralInformationExtension3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DTCC  (The Depository Trust and Clearing Corporation) native corporate action event type name. Used in place for the events that cannot be classified by ISO Code and are marked as OTHR. Can be used in combination with DTCC sub event type (when provided) to identify the event. For an example: a distribution based on recapitalisation event will be presented as event type: OTHR in standard message. DTCC native event type would be Distribution (DIST) and DTCC sub event type would be Recapitalisation. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEventType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionGeneralInformationExtension3.mmObject();
			isDerived = false;
			xmlTag = "EvtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventType";
			definition = "DTCC  (The Depository Trust and Clearing Corporation) native corporate action event type name. Used in place for the events that cannot be classified by ISO Code and are marked as OTHR. Can be used in combination with DTCC sub event type (when provided) to identify the event. For an example: a distribution based on recapitalisation event will be presented as event type: OTHR in standard message. DTCC native event type would be Distribution (DIST) and DTCC sub event type would be Recapitalisation. ";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ExtendedEventType1Code.mmObject();
		}
	};
	protected DTCCSubEventType1Code subEventType;
	/**
	 * DTCC (The Depository Trust and Clearing Corporation) native corporate
	 * action sub event type name further defines the event type. For an
	 * example: a cash dividend event with currency election will be noted as
	 * event type: Cash Dividend (DVCA) and DTCC sub event type: Currency
	 * Election(CURR).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code
	 * DTCCSubEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationExtension3
	 * CorporateActionGeneralInformationExtension3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubEvtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubEventType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DTCC  (The Depository Trust and Clearing Corporation) native corporate action sub event type name further defines the event type. For an example: a cash dividend event with currency election will be noted as event type: Cash Dividend (DVCA) and DTCC sub event type: Currency Election(CURR)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSubEventType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionGeneralInformationExtension3.mmObject();
			isDerived = false;
			xmlTag = "SubEvtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubEventType";
			definition = "DTCC  (The Depository Trust and Clearing Corporation) native corporate action sub event type name further defines the event type. For an example: a cash dividend event with currency election will be noted as event type: Cash Dividend (DVCA) and DTCC sub event type: Currency Election(CURR).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DTCCSubEventType1Code.mmObject();
		}
	};
	protected CorporateActionTransactionCategory1Code transactionCategory;
	/**
	 * Transaction category to which the corporate action event type belongs to
	 * for reporting purposes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionTransactionCategory1Code
	 * CorporateActionTransactionCategory1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationExtension3
	 * CorporateActionGeneralInformationExtension3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxCtgy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionCategory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction category to which the corporate action event type belongs to for reporting purposes."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionCategory = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionGeneralInformationExtension3.mmObject();
			isDerived = false;
			xmlTag = "TxCtgy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionCategory";
			definition = "Transaction category to which the corporate action event type belongs to for reporting purposes.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CorporateActionTransactionCategory1Code.mmObject();
		}
	};
	protected Max4AlphaNumericText reasonCode;
	/**
	 * Reason for the adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max4AlphaNumericText
	 * Max4AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationExtension3
	 * CorporateActionGeneralInformationExtension3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RsnCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReasonCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the adjustment."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReasonCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionGeneralInformationExtension3.mmObject();
			isDerived = false;
			xmlTag = "RsnCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReasonCode";
			definition = "Reason for the adjustment.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}
	};
	protected Exact5NumericText dTCReasonCode;
	/**
	 * Reason for the adjustment from ATP system at DTC (The Depository Trust
	 * Corporation).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact5NumericText
	 * Exact5NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationExtension3
	 * CorporateActionGeneralInformationExtension3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCRsnCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCReasonCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason for the adjustment from ATP system at DTC (The Depository Trust Corporation). "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCReasonCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionGeneralInformationExtension3.mmObject();
			isDerived = false;
			xmlTag = "DTCRsnCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCReasonCode";
			definition = "Reason for the adjustment from ATP system at DTC (The Depository Trust Corporation). ";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact5NumericText.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionGeneralInformationExtension3.mmPlaceAndName, CorporateActionGeneralInformationExtension3.mmEventType, CorporateActionGeneralInformationExtension3.mmSubEventType,
						CorporateActionGeneralInformationExtension3.mmTransactionCategory, CorporateActionGeneralInformationExtension3.mmReasonCode, CorporateActionGeneralInformationExtension3.mmDTCReasonCode);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CorporateActionGeneralInformationExtension3";
				definition = "Provides additional information regarding corporate action general information details.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PlcAndNm", required = true)
	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public void setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
	}

	@XmlElement(name = "EvtTp")
	public ExtendedEventType1Code getEventType() {
		return eventType;
	}

	public void setEventType(ExtendedEventType1Code eventType) {
		this.eventType = eventType;
	}

	@XmlElement(name = "SubEvtTp")
	public DTCCSubEventType1Code getSubEventType() {
		return subEventType;
	}

	public void setSubEventType(DTCCSubEventType1Code subEventType) {
		this.subEventType = subEventType;
	}

	@XmlElement(name = "TxCtgy")
	public CorporateActionTransactionCategory1Code getTransactionCategory() {
		return transactionCategory;
	}

	public void setTransactionCategory(CorporateActionTransactionCategory1Code transactionCategory) {
		this.transactionCategory = transactionCategory;
	}

	@XmlElement(name = "RsnCd")
	public Max4AlphaNumericText getReasonCode() {
		return reasonCode;
	}

	public void setReasonCode(Max4AlphaNumericText reasonCode) {
		this.reasonCode = reasonCode;
	}

	@XmlElement(name = "DTCRsnCd")
	public Exact5NumericText getDTCReasonCode() {
		return dTCReasonCode;
	}

	public void setDTCReasonCode(Exact5NumericText dTCReasonCode) {
		this.dTCReasonCode = dTCReasonCode;
	}
}