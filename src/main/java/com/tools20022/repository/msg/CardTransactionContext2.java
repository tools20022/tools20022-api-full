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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.CardPaymentAcquiring;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Context of the card transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionContext2#mmCardPresent
 * CardTransactionContext2.mmCardPresent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionContext2#mmCardholderPresent
 * CardTransactionContext2.mmCardholderPresent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionContext2#mmLocationCategory
 * CardTransactionContext2.mmLocationCategory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionContext2#mmAttendanceContext
 * CardTransactionContext2.mmAttendanceContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionContext2#mmTransactionEnvironment
 * CardTransactionContext2.mmTransactionEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionContext2#mmHostingCategory
 * CardTransactionContext2.mmHostingCategory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionContext2#mmTransactionChannel
 * CardTransactionContext2.mmTransactionChannel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionContext2#mmCardDataEntryMode
 * CardTransactionContext2.mmCardDataEntryMode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionContext2#mmFallbackIndicator
 * CardTransactionContext2.mmFallbackIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionContext2#mmSupportedOption
 * CardTransactionContext2.mmSupportedOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionContext2#mmSpecialConditions
 * CardTransactionContext2.mmSpecialConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionContext2#mmRiskIndicator
 * CardTransactionContext2.mmRiskIndicator}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
 * CardPaymentAcquiring}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardTransactionContext2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Context of the card transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransactionContext4
 * CardTransactionContext4}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardTransactionContext2", propOrder = {"cardPresent", "cardholderPresent", "locationCategory", "attendanceContext", "transactionEnvironment", "hostingCategory", "transactionChannel", "cardDataEntryMode",
		"fallbackIndicator", "supportedOption", "specialConditions", "riskIndicator"})
public class CardTransactionContext2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CardPres")
	protected TrueFalseIndicator cardPresent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmCardPresent
	 * CardPaymentAcquiring.mmCardPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionContext2
	 * CardTransactionContext2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardPres"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardPresent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the transaction has been initiated by a card physically present or not. \r\nIt correspond to the ISO 8583:1993 field number 22-6."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCardPresent = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmCardPresent;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionContext2.mmObject();
			isDerived = false;
			xmlTag = "CardPres";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardPresent";
			definition = "Indicates whether the transaction has been initiated by a card physically present or not. \r\nIt correspond to the ISO 8583:1993 field number 22-6.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	@XmlElement(name = "CrdhldrPres")
	protected TrueFalseIndicator cardholderPresent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmCardholderPresent
	 * CardPaymentAcquiring.mmCardholderPresent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionContext2
	 * CardTransactionContext2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CrdhldrPres"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardholderPresent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the transaction has been initiated in presence of the cardholder or not. \r\nIt correspond to the ISO 8583:1993 field number 22-5."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCardholderPresent = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmCardholderPresent;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionContext2.mmObject();
			isDerived = false;
			xmlTag = "CrdhldrPres";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardholderPresent";
			definition = "Indicates whether the transaction has been initiated in presence of the cardholder or not. \r\nIt correspond to the ISO 8583:1993 field number 22-5.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	@XmlElement(name = "LctnCtgy")
	protected LocationCategory2Code locationCategory;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.LocationCategory2Code
	 * LocationCategory2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmLocation
	 * CardPaymentAcquiring.mmLocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionContext2
	 * CardTransactionContext2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LctnCtgy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocationCategory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Location category of the place where the transaction is actually performed. \r\nIt correspond partially to the ISO 8583:1993 field number 22-4."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLocationCategory = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmLocation;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionContext2.mmObject();
			isDerived = false;
			xmlTag = "LctnCtgy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocationCategory";
			definition = "Location category of the place where the transaction is actually performed. \r\nIt correspond partially to the ISO 8583:1993 field number 22-4.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> LocationCategory2Code.mmObject();
		}
	};
	@XmlElement(name = "AttndncCntxt")
	protected AttendanceContext1Code attendanceContext;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AttendanceContext1Code
	 * AttendanceContext1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmAttendanceContext
	 * CardPaymentAcquiring.mmAttendanceContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionContext2
	 * CardTransactionContext2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AttndncCntxt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AttendanceContext"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Human attendance at the terminal location during the transaction. \r\nIt correspond partially to the ISO 8583:1993 field number 22-4."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAttendanceContext = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmAttendanceContext;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionContext2.mmObject();
			isDerived = false;
			xmlTag = "AttndncCntxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttendanceContext";
			definition = "Human attendance at the terminal location during the transaction. \r\nIt correspond partially to the ISO 8583:1993 field number 22-4.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AttendanceContext1Code.mmObject();
		}
	};
	@XmlElement(name = "TxEnvt")
	protected TransactionEnvironment2Code transactionEnvironment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionEnvironment2Code
	 * TransactionEnvironment2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmTransactionEnvironment
	 * CardPaymentAcquiring.mmTransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionContext2
	 * CardTransactionContext2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxEnvt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionEnvironment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the environment of the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionEnvironment = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmTransactionEnvironment;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionContext2.mmObject();
			isDerived = false;
			xmlTag = "TxEnvt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionEnvironment";
			definition = "Indicates the environment of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TransactionEnvironment2Code.mmObject();
		}
	};
	@XmlElement(name = "HstgCtgy")
	protected TransactionEnvironment3Code hostingCategory;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionEnvironment3Code
	 * TransactionEnvironment3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionContext2
	 * CardTransactionContext2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HstgCtgy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HostingCategory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the entity hosting the terminal performing the transaction. \r\nIt correspond partially to the ISO 8583:1993 field number 22-4."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmHostingCategory = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionContext2.mmObject();
			isDerived = false;
			xmlTag = "HstgCtgy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostingCategory";
			definition = "Indicates the entity hosting the terminal performing the transaction. \r\nIt correspond partially to the ISO 8583:1993 field number 22-4.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TransactionEnvironment3Code.mmObject();
		}
	};
	@XmlElement(name = "TxChanl")
	protected TransactionChannel3Code transactionChannel;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannel3Code
	 * TransactionChannel3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmTransactionChannel
	 * CardPaymentAcquiring.mmTransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionContext2
	 * CardTransactionContext2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxChanl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionChannel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the type of the communication channels used by the cardholder to the acceptor system. \r\nIt correspond to the ISO 8583:1993 field number 22-5."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionChannel = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmTransactionChannel;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionContext2.mmObject();
			isDerived = false;
			xmlTag = "TxChanl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionChannel";
			definition = "Identifies the type of the communication channels used by the cardholder to the acceptor system. \r\nIt correspond to the ISO 8583:1993 field number 22-5.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TransactionChannel3Code.mmObject();
		}
	};
	@XmlElement(name = "CardDataNtryMd", required = true)
	protected CardDataReading2Code cardDataEntryMode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading2Code
	 * CardDataReading2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmCardDataEntryMode
	 * CardPaymentAcquiring.mmCardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionContext2
	 * CardTransactionContext2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardDataNtryMd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardDataEntryMode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entry mode of the card data. \r\nIt correspond to the ISO 8583 field number 25 for the version 87 (partially), field number 22-7 for the version 93, and field number 22-1 for the version 2003."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCardDataEntryMode = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmCardDataEntryMode;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionContext2.mmObject();
			isDerived = false;
			xmlTag = "CardDataNtryMd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardDataEntryMode";
			definition = "Entry mode of the card data. \r\nIt correspond to the ISO 8583 field number 25 for the version 87 (partially), field number 22-7 for the version 93, and field number 22-1 for the version 2003.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CardDataReading2Code.mmObject();
		}
	};
	@XmlElement(name = "FllbckInd")
	protected CardFallback1Code fallbackIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardFallback1Code
	 * CardFallback1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionContext2
	 * CardTransactionContext2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FllbckInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FallbackIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicator of a card entry mode fall-back. It correspond to the ISO 8583:2003 field number 22-1."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFallbackIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionContext2.mmObject();
			isDerived = false;
			xmlTag = "FllbckInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FallbackIndicator";
			definition = "Indicator of a card entry mode fall-back. It correspond to the ISO 8583:2003 field number 22-1.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CardFallback1Code.mmObject();
		}
	};
	@XmlElement(name = "SpprtdOptn")
	protected List<SupportedPaymentOption1Code> supportedOption;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SupportedPaymentOption1Code
	 * SupportedPaymentOption1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionContext2
	 * CardTransactionContext2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SpprtdOptn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupportedOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment options the card acceptor can support."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSupportedOption = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionContext2.mmObject();
			isDerived = false;
			xmlTag = "SpprtdOptn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupportedOption";
			definition = "Payment options the card acceptor can support.";
			minOccurs = 0;
			simpleType_lazy = () -> SupportedPaymentOption1Code.mmObject();
		}
	};
	@XmlElement(name = "SpclConds")
	protected List<com.tools20022.repository.msg.CardTransactionCondition1> specialConditions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionCondition1
	 * CardTransactionCondition1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionContext2
	 * CardTransactionContext2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SpclConds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Data used to assign specific condition such as liability shift or preferential interchange fees."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionContext4#mmSpecialConditions
	 * CardTransactionContext4.mmSpecialConditions}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSpecialConditions = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionContext2.mmObject();
			isDerived = false;
			xmlTag = "SpclConds";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialConditions";
			definition = "Data used to assign specific condition such as liability shift or preferential interchange fees.";
			nextVersions_lazy = () -> Arrays.asList(CardTransactionContext4.mmSpecialConditions);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CardTransactionCondition1.mmObject();
		}
	};
	@XmlElement(name = "RskInd")
	protected List<com.tools20022.repository.msg.CardTransactionRiskIndicator1> riskIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionRiskIndicator1
	 * CardTransactionRiskIndicator1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionContext2
	 * CardTransactionContext2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RskInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RiskIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates to the issuer the level of risk of the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRiskIndicator = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionContext2.mmObject();
			isDerived = false;
			xmlTag = "RskInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RiskIndicator";
			definition = "Indicates to the issuer the level of risk of the transaction.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CardTransactionRiskIndicator1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardTransactionContext2.mmCardPresent, com.tools20022.repository.msg.CardTransactionContext2.mmCardholderPresent,
						com.tools20022.repository.msg.CardTransactionContext2.mmLocationCategory, com.tools20022.repository.msg.CardTransactionContext2.mmAttendanceContext,
						com.tools20022.repository.msg.CardTransactionContext2.mmTransactionEnvironment, com.tools20022.repository.msg.CardTransactionContext2.mmHostingCategory,
						com.tools20022.repository.msg.CardTransactionContext2.mmTransactionChannel, com.tools20022.repository.msg.CardTransactionContext2.mmCardDataEntryMode,
						com.tools20022.repository.msg.CardTransactionContext2.mmFallbackIndicator, com.tools20022.repository.msg.CardTransactionContext2.mmSupportedOption,
						com.tools20022.repository.msg.CardTransactionContext2.mmSpecialConditions, com.tools20022.repository.msg.CardTransactionContext2.mmRiskIndicator);
				trace_lazy = () -> CardPaymentAcquiring.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardTransactionContext2";
				definition = "Context of the card transaction.";
				nextVersions_lazy = () -> Arrays.asList(CardTransactionContext4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<TrueFalseIndicator> getCardPresent() {
		return cardPresent == null ? Optional.empty() : Optional.of(cardPresent);
	}

	public CardTransactionContext2 setCardPresent(TrueFalseIndicator cardPresent) {
		this.cardPresent = cardPresent;
		return this;
	}

	public Optional<TrueFalseIndicator> getCardholderPresent() {
		return cardholderPresent == null ? Optional.empty() : Optional.of(cardholderPresent);
	}

	public CardTransactionContext2 setCardholderPresent(TrueFalseIndicator cardholderPresent) {
		this.cardholderPresent = cardholderPresent;
		return this;
	}

	public Optional<LocationCategory2Code> getLocationCategory() {
		return locationCategory == null ? Optional.empty() : Optional.of(locationCategory);
	}

	public CardTransactionContext2 setLocationCategory(LocationCategory2Code locationCategory) {
		this.locationCategory = locationCategory;
		return this;
	}

	public Optional<AttendanceContext1Code> getAttendanceContext() {
		return attendanceContext == null ? Optional.empty() : Optional.of(attendanceContext);
	}

	public CardTransactionContext2 setAttendanceContext(AttendanceContext1Code attendanceContext) {
		this.attendanceContext = attendanceContext;
		return this;
	}

	public Optional<TransactionEnvironment2Code> getTransactionEnvironment() {
		return transactionEnvironment == null ? Optional.empty() : Optional.of(transactionEnvironment);
	}

	public CardTransactionContext2 setTransactionEnvironment(TransactionEnvironment2Code transactionEnvironment) {
		this.transactionEnvironment = transactionEnvironment;
		return this;
	}

	public Optional<TransactionEnvironment3Code> getHostingCategory() {
		return hostingCategory == null ? Optional.empty() : Optional.of(hostingCategory);
	}

	public CardTransactionContext2 setHostingCategory(TransactionEnvironment3Code hostingCategory) {
		this.hostingCategory = hostingCategory;
		return this;
	}

	public Optional<TransactionChannel3Code> getTransactionChannel() {
		return transactionChannel == null ? Optional.empty() : Optional.of(transactionChannel);
	}

	public CardTransactionContext2 setTransactionChannel(TransactionChannel3Code transactionChannel) {
		this.transactionChannel = transactionChannel;
		return this;
	}

	public CardDataReading2Code getCardDataEntryMode() {
		return cardDataEntryMode;
	}

	public CardTransactionContext2 setCardDataEntryMode(CardDataReading2Code cardDataEntryMode) {
		this.cardDataEntryMode = Objects.requireNonNull(cardDataEntryMode);
		return this;
	}

	public Optional<CardFallback1Code> getFallbackIndicator() {
		return fallbackIndicator == null ? Optional.empty() : Optional.of(fallbackIndicator);
	}

	public CardTransactionContext2 setFallbackIndicator(CardFallback1Code fallbackIndicator) {
		this.fallbackIndicator = fallbackIndicator;
		return this;
	}

	public List<SupportedPaymentOption1Code> getSupportedOption() {
		return supportedOption == null ? supportedOption = new ArrayList<>() : supportedOption;
	}

	public CardTransactionContext2 setSupportedOption(List<SupportedPaymentOption1Code> supportedOption) {
		this.supportedOption = Objects.requireNonNull(supportedOption);
		return this;
	}

	public List<CardTransactionCondition1> getSpecialConditions() {
		return specialConditions == null ? specialConditions = new ArrayList<>() : specialConditions;
	}

	public CardTransactionContext2 setSpecialConditions(List<com.tools20022.repository.msg.CardTransactionCondition1> specialConditions) {
		this.specialConditions = Objects.requireNonNull(specialConditions);
		return this;
	}

	public List<CardTransactionRiskIndicator1> getRiskIndicator() {
		return riskIndicator == null ? riskIndicator = new ArrayList<>() : riskIndicator;
	}

	public CardTransactionContext2 setRiskIndicator(List<com.tools20022.repository.msg.CardTransactionRiskIndicator1> riskIndicator) {
		this.riskIndicator = Objects.requireNonNull(riskIndicator);
		return this;
	}
}