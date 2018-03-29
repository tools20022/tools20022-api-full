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
import com.tools20022.repository.codeset.NotificationStatus3Code;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max105Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.entity.PaymentIdentification;
import com.tools20022.repository.entity.PaymentStatus;
import com.tools20022.repository.entity.TradeIdentification;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.OriginalItemReference3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identifies the original notification item and to provide the status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus4#mmOriginalItemIdentification
 * OriginalItemAndStatus4.mmOriginalItemIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus4#mmOriginalEndToEndIdentification
 * OriginalItemAndStatus4.mmOriginalEndToEndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus4#mmAmount
 * OriginalItemAndStatus4.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus4#mmExpectedValueDate
 * OriginalItemAndStatus4.mmExpectedValueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus4#mmItemStatus
 * OriginalItemAndStatus4.mmItemStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus4#mmAdditionalStatusInformation
 * OriginalItemAndStatus4.mmAdditionalStatusInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus4#mmOriginalItemReference
 * OriginalItemAndStatus4.mmOriginalItemReference}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
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
 * "OriginalItemAndStatus4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the original notification item and to provide the status."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalItemAndStatus5
 * OriginalItemAndStatus5}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus3
 * OriginalItemAndStatus3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OriginalItemAndStatus4", propOrder = {"originalItemIdentification", "originalEndToEndIdentification", "amount", "expectedValueDate", "itemStatus", "additionalStatusInformation", "originalItemReference"})
public class OriginalItemAndStatus4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OrgnlItmId", required = true)
	protected Max35Text originalItemIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmIdentification
	 * TradeIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus4
	 * OriginalItemAndStatus4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlItmId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalItemIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the original notification item."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus5#mmOriginalItemIdentification
	 * OriginalItemAndStatus5.mmOriginalItemIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus3#mmOriginalItemIdentification
	 * OriginalItemAndStatus3.mmOriginalItemIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginalItemAndStatus4, Max35Text> mmOriginalItemIdentification = new MMMessageAttribute<OriginalItemAndStatus4, Max35Text>() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalItemAndStatus4.mmObject();
			isDerived = false;
			xmlTag = "OrgnlItmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalItemIdentification";
			definition = "Identification of the original notification item.";
			nextVersions_lazy = () -> Arrays.asList(OriginalItemAndStatus5.mmOriginalItemIdentification);
			previousVersion_lazy = () -> OriginalItemAndStatus3.mmOriginalItemIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(OriginalItemAndStatus4 obj) {
			return obj.getOriginalItemIdentification();
		}

		@Override
		public void setValue(OriginalItemAndStatus4 obj, Max35Text value) {
			obj.setOriginalItemIdentification(value);
		}
	};
	@XmlElement(name = "OrgnlEndToEndId")
	protected Max35Text originalEndToEndIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmEndToEndIdentification
	 * PaymentIdentification.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus4
	 * OriginalItemAndStatus4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlEndToEndId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalEndToEndIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification as assigned by the debtor to unambiguously identify the original underlying transaction to the creditor."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus5#mmOriginalEndToEndIdentification
	 * OriginalItemAndStatus5.mmOriginalEndToEndIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus3#mmOriginalEndToEndIdentification
	 * OriginalItemAndStatus3.mmOriginalEndToEndIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginalItemAndStatus4, Optional<Max35Text>> mmOriginalEndToEndIdentification = new MMMessageAttribute<OriginalItemAndStatus4, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmEndToEndIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalItemAndStatus4.mmObject();
			isDerived = false;
			xmlTag = "OrgnlEndToEndId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalEndToEndIdentification";
			definition = "Unique identification as assigned by the debtor to unambiguously identify the original underlying transaction to the creditor.";
			nextVersions_lazy = () -> Arrays.asList(OriginalItemAndStatus5.mmOriginalEndToEndIdentification);
			previousVersion_lazy = () -> OriginalItemAndStatus3.mmOriginalEndToEndIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(OriginalItemAndStatus4 obj) {
			return obj.getOriginalEndToEndIdentification();
		}

		@Override
		public void setValue(OriginalItemAndStatus4 obj, Optional<Max35Text> value) {
			obj.setOriginalEndToEndIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "Amt", required = true)
	protected ActiveOrHistoricCurrencyAndAmount amount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmAmount
	 * Payment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus4
	 * OriginalItemAndStatus4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money expected to be credited to the account, as per the original notification to receive."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus5#mmAmount
	 * OriginalItemAndStatus5.mmAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus3#mmAmount
	 * OriginalItemAndStatus3.mmAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginalItemAndStatus4, ActiveOrHistoricCurrencyAndAmount> mmAmount = new MMMessageAttribute<OriginalItemAndStatus4, ActiveOrHistoricCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> Payment.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalItemAndStatus4.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Amount of money expected to be credited to the account, as per the original notification to receive.";
			nextVersions_lazy = () -> Arrays.asList(OriginalItemAndStatus5.mmAmount);
			previousVersion_lazy = () -> OriginalItemAndStatus3.mmAmount;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveOrHistoricCurrencyAndAmount getValue(OriginalItemAndStatus4 obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(OriginalItemAndStatus4 obj, ActiveOrHistoricCurrencyAndAmount value) {
			obj.setAmount(value);
		}
	};
	@XmlElement(name = "XpctdValDt")
	protected ISODate expectedValueDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmValueDate
	 * Payment.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus4
	 * OriginalItemAndStatus4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpctdValDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpectedValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value date on which the account was expected to be credited."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus5#mmExpectedValueDate
	 * OriginalItemAndStatus5.mmExpectedValueDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus3#mmExpectedValueDate
	 * OriginalItemAndStatus3.mmExpectedValueDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginalItemAndStatus4, Optional<ISODate>> mmExpectedValueDate = new MMMessageAttribute<OriginalItemAndStatus4, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmValueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalItemAndStatus4.mmObject();
			isDerived = false;
			xmlTag = "XpctdValDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedValueDate";
			definition = "Value date on which the account was expected to be credited.";
			nextVersions_lazy = () -> Arrays.asList(OriginalItemAndStatus5.mmExpectedValueDate);
			previousVersion_lazy = () -> OriginalItemAndStatus3.mmExpectedValueDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(OriginalItemAndStatus4 obj) {
			return obj.getExpectedValueDate();
		}

		@Override
		public void setValue(OriginalItemAndStatus4 obj, Optional<ISODate> value) {
			obj.setExpectedValueDate(value.orElse(null));
		}
	};
	@XmlElement(name = "ItmSts", required = true)
	protected NotificationStatus3Code itemStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.NotificationStatus3Code
	 * NotificationStatus3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmNotificationStatus
	 * PaymentStatus.mmNotificationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus4
	 * OriginalItemAndStatus4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ItmSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ItemStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the status of the notification item."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus5#mmItemStatus
	 * OriginalItemAndStatus5.mmItemStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus3#mmItemStatus
	 * OriginalItemAndStatus3.mmItemStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginalItemAndStatus4, NotificationStatus3Code> mmItemStatus = new MMMessageAttribute<OriginalItemAndStatus4, NotificationStatus3Code>() {
		{
			businessElementTrace_lazy = () -> PaymentStatus.mmNotificationStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalItemAndStatus4.mmObject();
			isDerived = false;
			xmlTag = "ItmSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ItemStatus";
			definition = "Specifies the status of the notification item.";
			nextVersions_lazy = () -> Arrays.asList(OriginalItemAndStatus5.mmItemStatus);
			previousVersion_lazy = () -> OriginalItemAndStatus3.mmItemStatus;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NotificationStatus3Code.mmObject();
		}

		@Override
		public NotificationStatus3Code getValue(OriginalItemAndStatus4 obj) {
			return obj.getItemStatus();
		}

		@Override
		public void setValue(OriginalItemAndStatus4 obj, NotificationStatus3Code value) {
			obj.setItemStatus(value);
		}
	};
	@XmlElement(name = "AddtlStsInf")
	protected Max105Text additionalStatusInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max105Text
	 * Max105Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus4
	 * OriginalItemAndStatus4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlStsInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalStatusInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Further details of the item status."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus5#mmAdditionalStatusInformation
	 * OriginalItemAndStatus5.mmAdditionalStatusInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus3#mmAdditionalStatusInformation
	 * OriginalItemAndStatus3.mmAdditionalStatusInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginalItemAndStatus4, Optional<Max105Text>> mmAdditionalStatusInformation = new MMMessageAttribute<OriginalItemAndStatus4, Optional<Max105Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalItemAndStatus4.mmObject();
			isDerived = false;
			xmlTag = "AddtlStsInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalStatusInformation";
			definition = "Further details of the item status.";
			nextVersions_lazy = () -> Arrays.asList(OriginalItemAndStatus5.mmAdditionalStatusInformation);
			previousVersion_lazy = () -> OriginalItemAndStatus3.mmAdditionalStatusInformation;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max105Text.mmObject();
		}

		@Override
		public Optional<Max105Text> getValue(OriginalItemAndStatus4 obj) {
			return obj.getAdditionalStatusInformation();
		}

		@Override
		public void setValue(OriginalItemAndStatus4 obj, Optional<Max105Text> value) {
			obj.setAdditionalStatusInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlItmRef")
	protected OriginalItemReference3 originalItemReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OriginalItemReference3
	 * OriginalItemReference3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus4
	 * OriginalItemAndStatus4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlItmRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalItemReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides further information in order to identify a previous payment notification."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus5#mmOriginalItemReference
	 * OriginalItemAndStatus5.mmOriginalItemReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus3#mmOriginalItemReference
	 * OriginalItemAndStatus3.mmOriginalItemReference}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OriginalItemAndStatus4, Optional<OriginalItemReference3>> mmOriginalItemReference = new MMMessageAssociationEnd<OriginalItemAndStatus4, Optional<OriginalItemReference3>>() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalItemAndStatus4.mmObject();
			isDerived = false;
			xmlTag = "OrgnlItmRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalItemReference";
			definition = "Provides further information in order to identify a previous payment notification.";
			nextVersions_lazy = () -> Arrays.asList(OriginalItemAndStatus5.mmOriginalItemReference);
			previousVersion_lazy = () -> OriginalItemAndStatus3.mmOriginalItemReference;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OriginalItemReference3.mmObject();
		}

		@Override
		public Optional<OriginalItemReference3> getValue(OriginalItemAndStatus4 obj) {
			return obj.getOriginalItemReference();
		}

		@Override
		public void setValue(OriginalItemAndStatus4 obj, Optional<OriginalItemReference3> value) {
			obj.setOriginalItemReference(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalItemAndStatus4.mmOriginalItemIdentification, com.tools20022.repository.msg.OriginalItemAndStatus4.mmOriginalEndToEndIdentification,
						com.tools20022.repository.msg.OriginalItemAndStatus4.mmAmount, com.tools20022.repository.msg.OriginalItemAndStatus4.mmExpectedValueDate, com.tools20022.repository.msg.OriginalItemAndStatus4.mmItemStatus,
						com.tools20022.repository.msg.OriginalItemAndStatus4.mmAdditionalStatusInformation, com.tools20022.repository.msg.OriginalItemAndStatus4.mmOriginalItemReference);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OriginalItemAndStatus4";
				definition = "Identifies the original notification item and to provide the status.";
				nextVersions_lazy = () -> Arrays.asList(OriginalItemAndStatus5.mmObject());
				previousVersion_lazy = () -> OriginalItemAndStatus3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getOriginalItemIdentification() {
		return originalItemIdentification;
	}

	public OriginalItemAndStatus4 setOriginalItemIdentification(Max35Text originalItemIdentification) {
		this.originalItemIdentification = Objects.requireNonNull(originalItemIdentification);
		return this;
	}

	public Optional<Max35Text> getOriginalEndToEndIdentification() {
		return originalEndToEndIdentification == null ? Optional.empty() : Optional.of(originalEndToEndIdentification);
	}

	public OriginalItemAndStatus4 setOriginalEndToEndIdentification(Max35Text originalEndToEndIdentification) {
		this.originalEndToEndIdentification = originalEndToEndIdentification;
		return this;
	}

	public ActiveOrHistoricCurrencyAndAmount getAmount() {
		return amount;
	}

	public OriginalItemAndStatus4 setAmount(ActiveOrHistoricCurrencyAndAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public Optional<ISODate> getExpectedValueDate() {
		return expectedValueDate == null ? Optional.empty() : Optional.of(expectedValueDate);
	}

	public OriginalItemAndStatus4 setExpectedValueDate(ISODate expectedValueDate) {
		this.expectedValueDate = expectedValueDate;
		return this;
	}

	public NotificationStatus3Code getItemStatus() {
		return itemStatus;
	}

	public OriginalItemAndStatus4 setItemStatus(NotificationStatus3Code itemStatus) {
		this.itemStatus = Objects.requireNonNull(itemStatus);
		return this;
	}

	public Optional<Max105Text> getAdditionalStatusInformation() {
		return additionalStatusInformation == null ? Optional.empty() : Optional.of(additionalStatusInformation);
	}

	public OriginalItemAndStatus4 setAdditionalStatusInformation(Max105Text additionalStatusInformation) {
		this.additionalStatusInformation = additionalStatusInformation;
		return this;
	}

	public Optional<OriginalItemReference3> getOriginalItemReference() {
		return originalItemReference == null ? Optional.empty() : Optional.of(originalItemReference);
	}

	public OriginalItemAndStatus4 setOriginalItemReference(OriginalItemReference3 originalItemReference) {
		this.originalItemReference = originalItemReference;
		return this;
	}
}