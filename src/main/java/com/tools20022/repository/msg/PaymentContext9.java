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
 * Payment context in which the transaction is performed.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentContext9#mmCardPresent
 * PaymentContext9.mmCardPresent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentContext9#mmCardholderPresent
 * PaymentContext9.mmCardholderPresent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentContext9#mmOnLineContext
 * PaymentContext9.mmOnLineContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentContext9#mmAttendanceContext
 * PaymentContext9.mmAttendanceContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentContext9#mmTransactionEnvironment
 * PaymentContext9.mmTransactionEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentContext9#mmTransactionChannel
 * PaymentContext9.mmTransactionChannel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentContext9#mmCardDataEntryMode
 * PaymentContext9.mmCardDataEntryMode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentContext9#mmFallbackIndicator
 * PaymentContext9.mmFallbackIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentContext9#mmSupportedOption
 * PaymentContext9.mmSupportedOption}</li>
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
 * "PaymentContext9"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Payment context in which the transaction is performed."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentContext15
 * PaymentContext15}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.PaymentContext6
 * PaymentContext6}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentContext9", propOrder = {"cardPresent", "cardholderPresent", "onLineContext", "attendanceContext", "transactionEnvironment", "transactionChannel", "cardDataEntryMode", "fallbackIndicator", "supportedOption"})
public class PaymentContext9 {

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
	 * {@linkplain com.tools20022.repository.msg.PaymentContext9
	 * PaymentContext9}</li>
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
	 * "Indicates whether the transaction has been initiated by a card physically present or not."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext15#mmCardPresent
	 * PaymentContext15.mmCardPresent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentContext6#mmCardPresent
	 * PaymentContext6.mmCardPresent}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCardPresent = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmCardPresent;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentContext9.mmObject();
			isDerived = false;
			xmlTag = "CardPres";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardPresent";
			definition = "Indicates whether the transaction has been initiated by a card physically present or not.";
			nextVersions_lazy = () -> Arrays.asList(PaymentContext15.mmCardPresent);
			previousVersion_lazy = () -> PaymentContext6.mmCardPresent;
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
	 * {@linkplain com.tools20022.repository.msg.PaymentContext9
	 * PaymentContext9}</li>
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
	 * "Indicates whether the transaction has been initiated in presence of the cardholder or not."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext15#mmCardholderPresent
	 * PaymentContext15.mmCardholderPresent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentContext6#mmCardholderPresent
	 * PaymentContext6.mmCardholderPresent}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCardholderPresent = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmCardholderPresent;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentContext9.mmObject();
			isDerived = false;
			xmlTag = "CrdhldrPres";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardholderPresent";
			definition = "Indicates whether the transaction has been initiated in presence of the cardholder or not.";
			nextVersions_lazy = () -> Arrays.asList(PaymentContext15.mmCardholderPresent);
			previousVersion_lazy = () -> PaymentContext6.mmCardholderPresent;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	@XmlElement(name = "OnLineCntxt")
	protected TrueFalseIndicator onLineContext;
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
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmOnLineContext
	 * CardPaymentAcquiring.mmOnLineContext}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentContext9
	 * PaymentContext9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OnLineCntxt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLineContext"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "On-line or off-line context of the transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext15#mmOnLineContext
	 * PaymentContext15.mmOnLineContext}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentContext6#mmOnLineContext
	 * PaymentContext6.mmOnLineContext}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOnLineContext = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmOnLineContext;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentContext9.mmObject();
			isDerived = false;
			xmlTag = "OnLineCntxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLineContext";
			definition = "On-line or off-line context of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(PaymentContext15.mmOnLineContext);
			previousVersion_lazy = () -> PaymentContext6.mmOnLineContext;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.PaymentContext9
	 * PaymentContext9}</li>
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
	 * "Human attendance at the POI (Point Of Interaction) location during the transaction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext15#mmAttendanceContext
	 * PaymentContext15.mmAttendanceContext}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentContext6#mmAttendanceContext
	 * PaymentContext6.mmAttendanceContext}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAttendanceContext = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmAttendanceContext;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentContext9.mmObject();
			isDerived = false;
			xmlTag = "AttndncCntxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttendanceContext";
			definition = "Human attendance at the POI (Point Of Interaction) location during the transaction.";
			nextVersions_lazy = () -> Arrays.asList(PaymentContext15.mmAttendanceContext);
			previousVersion_lazy = () -> PaymentContext6.mmAttendanceContext;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AttendanceContext1Code.mmObject();
		}
	};
	@XmlElement(name = "TxEnvt")
	protected TransactionEnvironment1Code transactionEnvironment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionEnvironment1Code
	 * TransactionEnvironment1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmTransactionEnvironment
	 * CardPaymentAcquiring.mmTransactionEnvironment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentContext9
	 * PaymentContext9}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext15#mmTransactionEnvironment
	 * PaymentContext15.mmTransactionEnvironment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentContext6#mmTransactionEnvironment
	 * PaymentContext6.mmTransactionEnvironment}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionEnvironment = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmTransactionEnvironment;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentContext9.mmObject();
			isDerived = false;
			xmlTag = "TxEnvt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionEnvironment";
			definition = "Indicates the environment of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(PaymentContext15.mmTransactionEnvironment);
			previousVersion_lazy = () -> PaymentContext6.mmTransactionEnvironment;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TransactionEnvironment1Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.PaymentContext9
	 * PaymentContext9}</li>
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
	 * "Identifies the type of the communication channels used by the cardholder to the acceptor system."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext15#mmTransactionChannel
	 * PaymentContext15.mmTransactionChannel}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentContext6#mmTransactionChannel
	 * PaymentContext6.mmTransactionChannel}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionChannel = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmTransactionChannel;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentContext9.mmObject();
			isDerived = false;
			xmlTag = "TxChanl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionChannel";
			definition = "Identifies the type of the communication channels used by the cardholder to the acceptor system.";
			nextVersions_lazy = () -> Arrays.asList(PaymentContext15.mmTransactionChannel);
			previousVersion_lazy = () -> PaymentContext6.mmTransactionChannel;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TransactionChannel3Code.mmObject();
		}
	};
	@XmlElement(name = "CardDataNtryMd", required = true)
	protected CardDataReading1Code cardDataEntryMode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading1Code
	 * CardDataReading1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmCardDataEntryMode
	 * CardPaymentAcquiring.mmCardDataEntryMode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentContext9
	 * PaymentContext9}</li>
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
	 * definition} = "Entry mode of the card data."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext15#mmCardDataEntryMode
	 * PaymentContext15.mmCardDataEntryMode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentContext6#mmCardDataEntryMode
	 * PaymentContext6.mmCardDataEntryMode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCardDataEntryMode = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmCardDataEntryMode;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentContext9.mmObject();
			isDerived = false;
			xmlTag = "CardDataNtryMd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardDataEntryMode";
			definition = "Entry mode of the card data.";
			nextVersions_lazy = () -> Arrays.asList(PaymentContext15.mmCardDataEntryMode);
			previousVersion_lazy = () -> PaymentContext6.mmCardDataEntryMode;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CardDataReading1Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.PaymentContext9
	 * PaymentContext9}</li>
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
	 * definition} = "Indicator of a card entry mode fallback."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext15#mmFallbackIndicator
	 * PaymentContext15.mmFallbackIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentContext6#mmFallbackIndicator
	 * PaymentContext6.mmFallbackIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFallbackIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentContext9.mmObject();
			isDerived = false;
			xmlTag = "FllbckInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FallbackIndicator";
			definition = "Indicator of a card entry mode fallback.";
			nextVersions_lazy = () -> Arrays.asList(PaymentContext15.mmFallbackIndicator);
			previousVersion_lazy = () -> PaymentContext6.mmFallbackIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.PaymentContext9
	 * PaymentContext9}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext15#mmSupportedOption
	 * PaymentContext15.mmSupportedOption}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentContext6#mmSupportedOption
	 * PaymentContext6.mmSupportedOption}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSupportedOption = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentContext9.mmObject();
			isDerived = false;
			xmlTag = "SpprtdOptn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupportedOption";
			definition = "Payment options the card acceptor can support.";
			nextVersions_lazy = () -> Arrays.asList(PaymentContext15.mmSupportedOption);
			previousVersion_lazy = () -> PaymentContext6.mmSupportedOption;
			minOccurs = 0;
			simpleType_lazy = () -> SupportedPaymentOption1Code.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentContext9.mmCardPresent, com.tools20022.repository.msg.PaymentContext9.mmCardholderPresent,
						com.tools20022.repository.msg.PaymentContext9.mmOnLineContext, com.tools20022.repository.msg.PaymentContext9.mmAttendanceContext, com.tools20022.repository.msg.PaymentContext9.mmTransactionEnvironment,
						com.tools20022.repository.msg.PaymentContext9.mmTransactionChannel, com.tools20022.repository.msg.PaymentContext9.mmCardDataEntryMode, com.tools20022.repository.msg.PaymentContext9.mmFallbackIndicator,
						com.tools20022.repository.msg.PaymentContext9.mmSupportedOption);
				trace_lazy = () -> CardPaymentAcquiring.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentContext9";
				definition = "Payment context in which the transaction is performed.";
				nextVersions_lazy = () -> Arrays.asList(PaymentContext15.mmObject());
				previousVersion_lazy = () -> PaymentContext6.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<TrueFalseIndicator> getCardPresent() {
		return cardPresent == null ? Optional.empty() : Optional.of(cardPresent);
	}

	public PaymentContext9 setCardPresent(TrueFalseIndicator cardPresent) {
		this.cardPresent = cardPresent;
		return this;
	}

	public Optional<TrueFalseIndicator> getCardholderPresent() {
		return cardholderPresent == null ? Optional.empty() : Optional.of(cardholderPresent);
	}

	public PaymentContext9 setCardholderPresent(TrueFalseIndicator cardholderPresent) {
		this.cardholderPresent = cardholderPresent;
		return this;
	}

	public Optional<TrueFalseIndicator> getOnLineContext() {
		return onLineContext == null ? Optional.empty() : Optional.of(onLineContext);
	}

	public PaymentContext9 setOnLineContext(TrueFalseIndicator onLineContext) {
		this.onLineContext = onLineContext;
		return this;
	}

	public Optional<AttendanceContext1Code> getAttendanceContext() {
		return attendanceContext == null ? Optional.empty() : Optional.of(attendanceContext);
	}

	public PaymentContext9 setAttendanceContext(AttendanceContext1Code attendanceContext) {
		this.attendanceContext = attendanceContext;
		return this;
	}

	public Optional<TransactionEnvironment1Code> getTransactionEnvironment() {
		return transactionEnvironment == null ? Optional.empty() : Optional.of(transactionEnvironment);
	}

	public PaymentContext9 setTransactionEnvironment(TransactionEnvironment1Code transactionEnvironment) {
		this.transactionEnvironment = transactionEnvironment;
		return this;
	}

	public Optional<TransactionChannel3Code> getTransactionChannel() {
		return transactionChannel == null ? Optional.empty() : Optional.of(transactionChannel);
	}

	public PaymentContext9 setTransactionChannel(TransactionChannel3Code transactionChannel) {
		this.transactionChannel = transactionChannel;
		return this;
	}

	public CardDataReading1Code getCardDataEntryMode() {
		return cardDataEntryMode;
	}

	public PaymentContext9 setCardDataEntryMode(CardDataReading1Code cardDataEntryMode) {
		this.cardDataEntryMode = Objects.requireNonNull(cardDataEntryMode);
		return this;
	}

	public Optional<CardFallback1Code> getFallbackIndicator() {
		return fallbackIndicator == null ? Optional.empty() : Optional.of(fallbackIndicator);
	}

	public PaymentContext9 setFallbackIndicator(CardFallback1Code fallbackIndicator) {
		this.fallbackIndicator = fallbackIndicator;
		return this;
	}

	public List<SupportedPaymentOption1Code> getSupportedOption() {
		return supportedOption == null ? supportedOption = new ArrayList<>() : supportedOption;
	}

	public PaymentContext9 setSupportedOption(List<SupportedPaymentOption1Code> supportedOption) {
		this.supportedOption = Objects.requireNonNull(supportedOption);
		return this;
	}
}