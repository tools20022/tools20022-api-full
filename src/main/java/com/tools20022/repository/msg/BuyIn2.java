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
import com.tools20022.repository.area.secl.BuyInConfirmationV03;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.BuyIn;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CashCompensation1;
import com.tools20022.repository.msg.Price4;
import com.tools20022.repository.msg.SecuritiesCompensation1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies elements related to the confirmation sent by the central
 * counterparty to the clearing member in the context of the buy in process.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BuyIn2#mmBuyInNotificationIdentification
 * BuyIn2.mmBuyInNotificationIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BuyIn2#mmBuyInIdentification
 * BuyIn2.mmBuyInIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BuyIn2#mmDate BuyIn2.mmDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BuyIn2#mmPrice BuyIn2.mmPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BuyIn2#mmSecuritiesBuyIn
 * BuyIn2.mmSecuritiesBuyIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BuyIn2#mmRequiredCashCompensation
 * BuyIn2.mmRequiredCashCompensation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.BuyIn BuyIn}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.BuyInConfirmationV03#mmBuyInDetails
 * BuyInConfirmationV03.mmBuyInDetails}</li>
 * </ul>
 * </li>
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
 * "BuyIn2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies elements related to the confirmation sent by the central counterparty to the clearing member in the context of the buy in process."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BuyIn2", propOrder = {"buyInNotificationIdentification", "buyInIdentification", "date", "price", "securitiesBuyIn", "requiredCashCompensation"})
public class BuyIn2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "BuyInNtfctnId")
	protected Max35Text buyInNotificationIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.BuyIn2
	 * BuyIn2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BuyInNtfctnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyInNotificationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the reference of the BuyInNotification message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BuyIn2, Optional<Max35Text>> mmBuyInNotificationIdentification = new MMMessageAttribute<BuyIn2, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BuyIn2.mmObject();
			isDerived = false;
			xmlTag = "BuyInNtfctnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyInNotificationIdentification";
			definition = "Indicates the reference of the BuyInNotification message.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(BuyIn2 obj) {
			return obj.getBuyInNotificationIdentification();
		}

		@Override
		public void setValue(BuyIn2 obj, Optional<Max35Text> value) {
			obj.setBuyInNotificationIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "BuyInId", required = true)
	protected Max35Text buyInIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.BuyIn2
	 * BuyIn2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BuyInId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyInIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the reference id of the buy in."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BuyIn2, Max35Text> mmBuyInIdentification = new MMMessageAttribute<BuyIn2, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BuyIn2.mmObject();
			isDerived = false;
			xmlTag = "BuyInId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyInIdentification";
			definition = "Indicates the reference id of the buy in.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(BuyIn2 obj) {
			return obj.getBuyInIdentification();
		}

		@Override
		public void setValue(BuyIn2 obj, Max35Text value) {
			obj.setBuyInIdentification(value);
		}
	};
	@XmlElement(name = "Dt", required = true)
	protected ISODate date;
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
	 * {@linkplain com.tools20022.repository.entity.BuyIn#mmBuyinDate
	 * BuyIn.mmBuyinDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.BuyIn2
	 * BuyIn2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Date"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the date at which the buy occured."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BuyIn2, ISODate> mmDate = new MMMessageAttribute<BuyIn2, ISODate>() {
		{
			businessElementTrace_lazy = () -> BuyIn.mmBuyinDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.BuyIn2.mmObject();
			isDerived = false;
			xmlTag = "Dt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Date";
			definition = "Provides the date at which the buy occured.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(BuyIn2 obj) {
			return obj.getDate();
		}

		@Override
		public void setValue(BuyIn2 obj, ISODate value) {
			obj.setDate(value);
		}
	};
	@XmlElement(name = "Pric")
	protected Price4 price;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Price4 Price4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BuyIn#mmBuyInPrice
	 * BuyIn.mmBuyInPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.BuyIn2
	 * BuyIn2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Price"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the price of the buy-in."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BuyIn2, Optional<Price4>> mmPrice = new MMMessageAssociationEnd<BuyIn2, Optional<Price4>>() {
		{
			businessElementTrace_lazy = () -> BuyIn.mmBuyInPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.BuyIn2.mmObject();
			isDerived = false;
			xmlTag = "Pric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Price";
			definition = "Provides the price of the buy-in.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Price4.mmObject();
		}

		@Override
		public Optional<Price4> getValue(BuyIn2 obj) {
			return obj.getPrice();
		}

		@Override
		public void setValue(BuyIn2 obj, Optional<Price4> value) {
			obj.setPrice(value.orElse(null));
		}
	};
	@XmlElement(name = "SctiesBuyIn")
	protected SecuritiesCompensation1 securitiesBuyIn;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCompensation1
	 * SecuritiesCompensation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BuyIn#mmSecuritiesCompensation
	 * BuyIn.mmSecuritiesCompensation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.BuyIn2
	 * BuyIn2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesBuyIn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesBuyIn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the elements related to the securities that the central counterparty had to buy in the context of the buy-in process."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BuyIn2, Optional<SecuritiesCompensation1>> mmSecuritiesBuyIn = new MMMessageAssociationEnd<BuyIn2, Optional<SecuritiesCompensation1>>() {
		{
			businessElementTrace_lazy = () -> BuyIn.mmSecuritiesCompensation;
			componentContext_lazy = () -> com.tools20022.repository.msg.BuyIn2.mmObject();
			isDerived = false;
			xmlTag = "SctiesBuyIn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesBuyIn";
			definition = "Specifies the elements related to the securities that the central counterparty had to buy in the context of the buy-in process.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecuritiesCompensation1.mmObject();
		}

		@Override
		public Optional<SecuritiesCompensation1> getValue(BuyIn2 obj) {
			return obj.getSecuritiesBuyIn();
		}

		@Override
		public void setValue(BuyIn2 obj, Optional<SecuritiesCompensation1> value) {
			obj.setSecuritiesBuyIn(value.orElse(null));
		}
	};
	@XmlElement(name = "ReqrdCshCompstn")
	protected CashCompensation1 requiredCashCompensation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashCompensation1
	 * CashCompensation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BuyIn#mmCashCompensation
	 * BuyIn.mmCashCompensation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.BuyIn2
	 * BuyIn2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqrdCshCompstn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequiredCashCompensation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the cash compensation required, in case the central counterparty could not buy the securities to cover the trade(s) that failed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BuyIn2, Optional<CashCompensation1>> mmRequiredCashCompensation = new MMMessageAssociationEnd<BuyIn2, Optional<CashCompensation1>>() {
		{
			businessElementTrace_lazy = () -> BuyIn.mmCashCompensation;
			componentContext_lazy = () -> com.tools20022.repository.msg.BuyIn2.mmObject();
			isDerived = false;
			xmlTag = "ReqrdCshCompstn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequiredCashCompensation";
			definition = "Provides details about the cash compensation required, in case the central counterparty could not buy the securities to cover the trade(s) that failed.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashCompensation1.mmObject();
		}

		@Override
		public Optional<CashCompensation1> getValue(BuyIn2 obj) {
			return obj.getRequiredCashCompensation();
		}

		@Override
		public void setValue(BuyIn2 obj, Optional<CashCompensation1> value) {
			obj.setRequiredCashCompensation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BuyIn2.mmBuyInNotificationIdentification, com.tools20022.repository.msg.BuyIn2.mmBuyInIdentification, com.tools20022.repository.msg.BuyIn2.mmDate,
						com.tools20022.repository.msg.BuyIn2.mmPrice, com.tools20022.repository.msg.BuyIn2.mmSecuritiesBuyIn, com.tools20022.repository.msg.BuyIn2.mmRequiredCashCompensation);
				messageBuildingBlock_lazy = () -> Arrays.asList(BuyInConfirmationV03.mmBuyInDetails);
				trace_lazy = () -> BuyIn.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BuyIn2";
				definition = "Specifies elements related to the confirmation sent by the central counterparty to the clearing member in the context of the buy in process.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getBuyInNotificationIdentification() {
		return buyInNotificationIdentification == null ? Optional.empty() : Optional.of(buyInNotificationIdentification);
	}

	public BuyIn2 setBuyInNotificationIdentification(Max35Text buyInNotificationIdentification) {
		this.buyInNotificationIdentification = buyInNotificationIdentification;
		return this;
	}

	public Max35Text getBuyInIdentification() {
		return buyInIdentification;
	}

	public BuyIn2 setBuyInIdentification(Max35Text buyInIdentification) {
		this.buyInIdentification = Objects.requireNonNull(buyInIdentification);
		return this;
	}

	public ISODate getDate() {
		return date;
	}

	public BuyIn2 setDate(ISODate date) {
		this.date = Objects.requireNonNull(date);
		return this;
	}

	public Optional<Price4> getPrice() {
		return price == null ? Optional.empty() : Optional.of(price);
	}

	public BuyIn2 setPrice(Price4 price) {
		this.price = price;
		return this;
	}

	public Optional<SecuritiesCompensation1> getSecuritiesBuyIn() {
		return securitiesBuyIn == null ? Optional.empty() : Optional.of(securitiesBuyIn);
	}

	public BuyIn2 setSecuritiesBuyIn(SecuritiesCompensation1 securitiesBuyIn) {
		this.securitiesBuyIn = securitiesBuyIn;
		return this;
	}

	public Optional<CashCompensation1> getRequiredCashCompensation() {
		return requiredCashCompensation == null ? Optional.empty() : Optional.of(requiredCashCompensation);
	}

	public BuyIn2 setRequiredCashCompensation(CashCompensation1 requiredCashCompensation) {
		this.requiredCashCompensation = requiredCashCompensation;
		return this;
	}
}