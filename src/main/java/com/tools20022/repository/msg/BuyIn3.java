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
import com.tools20022.repository.area.secl.BuyInResponseV03;
import com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.BuyIn;
import com.tools20022.repository.entity.SecuritiesTransfer;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies elements related to the response sent by the clearing member to the
 * central counterparty in the context of the buy in process.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BuyIn3#mmBuyInNotificationIdentification
 * BuyIn3.mmBuyInNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BuyIn3#mmRequestForDelayIndicator
 * BuyIn3.mmRequestForDelayIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BuyIn3#mmNumberOfDays
 * BuyIn3.mmNumberOfDays}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BuyIn3#mmInitialQuantity
 * BuyIn3.mmInitialQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BuyIn3#mmCoveredQuantity
 * BuyIn3.mmCoveredQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BuyIn3#mmUncoveredQuantity
 * BuyIn3.mmUncoveredQuantity}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.BuyIn BuyIn}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.BuyInResponseV03#mmBuyInResponseDetails
 * BuyInResponseV03.mmBuyInResponseDetails}</li>
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
 * "BuyIn3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies elements related to the response sent by the clearing member to the central counterparty in the context of the buy in process."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BuyIn3", propOrder = {"buyInNotificationIdentification", "requestForDelayIndicator", "numberOfDays", "initialQuantity", "coveredQuantity", "uncoveredQuantity"})
public class BuyIn3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "BuyInNtfctnId", required = true)
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.BuyIn3
	 * BuyIn3}</li>
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
	public static final MMMessageAttribute<BuyIn3, Max35Text> mmBuyInNotificationIdentification = new MMMessageAttribute<BuyIn3, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BuyIn3.mmObject();
			isDerived = false;
			xmlTag = "BuyInNtfctnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyInNotificationIdentification";
			definition = "Indicates the reference of the BuyInNotification message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(BuyIn3 obj) {
			return obj.getBuyInNotificationIdentification();
		}

		@Override
		public void setValue(BuyIn3 obj, Max35Text value) {
			obj.setBuyInNotificationIdentification(value);
		}
	};
	@XmlElement(name = "ReqForDelyInd", required = true)
	protected YesNoIndicator requestForDelayIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.BuyIn3
	 * BuyIn3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqForDelyInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestForDelayIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specific continuous net settlement case where the central counterparty can call for buy-in at a date anterior to \"theoretical\" buy-in date, the clearing member may request a delay."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BuyIn3, YesNoIndicator> mmRequestForDelayIndicator = new MMMessageAttribute<BuyIn3, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BuyIn3.mmObject();
			isDerived = false;
			xmlTag = "ReqForDelyInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestForDelayIndicator";
			definition = "Specific continuous net settlement case where the central counterparty can call for buy-in at a date anterior to \"theoretical\" buy-in date, the clearing member may request a delay.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(BuyIn3 obj) {
			return obj.getRequestForDelayIndicator();
		}

		@Override
		public void setValue(BuyIn3 obj, YesNoIndicator value) {
			obj.setRequestForDelayIndicator(value);
		}
	};
	@XmlElement(name = "NbOfDays", required = true)
	protected Number numberOfDays;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.BuyIn3
	 * BuyIn3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfDays"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfDays"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of days associated to the request for delay."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BuyIn3, Number> mmNumberOfDays = new MMMessageAttribute<BuyIn3, Number>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BuyIn3.mmObject();
			isDerived = false;
			xmlTag = "NbOfDays";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfDays";
			definition = "Number of days associated to the request for delay.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(BuyIn3 obj) {
			return obj.getNumberOfDays();
		}

		@Override
		public void setValue(BuyIn3 obj, Number value) {
			obj.setNumberOfDays(value);
		}
	};
	@XmlElement(name = "InitlQty", required = true)
	protected FinancialInstrumentQuantity1Choice initialQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BuyIn#mmSecuritiesCompensation
	 * BuyIn.mmSecuritiesCompensation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.BuyIn3
	 * BuyIn3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InitlQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitialQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Buy in quantity called initially by the central counterparty."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BuyIn3, FinancialInstrumentQuantity1Choice> mmInitialQuantity = new MMMessageAssociationEnd<BuyIn3, FinancialInstrumentQuantity1Choice>() {
		{
			businessElementTrace_lazy = () -> BuyIn.mmSecuritiesCompensation;
			componentContext_lazy = () -> com.tools20022.repository.msg.BuyIn3.mmObject();
			isDerived = false;
			xmlTag = "InitlQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitialQuantity";
			definition = "Buy in quantity called initially by the central counterparty.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}

		@Override
		public FinancialInstrumentQuantity1Choice getValue(BuyIn3 obj) {
			return obj.getInitialQuantity();
		}

		@Override
		public void setValue(BuyIn3 obj, FinancialInstrumentQuantity1Choice value) {
			obj.setInitialQuantity(value);
		}
	};
	@XmlElement(name = "CvrdQty", required = true)
	protected FinancialInstrumentQuantity1Choice coveredQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransferredQuantity
	 * SecuritiesTransfer.mmTransferredQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.BuyIn3
	 * BuyIn3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CvrdQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoveredQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity amount covered by the clearing member after notification."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BuyIn3, FinancialInstrumentQuantity1Choice> mmCoveredQuantity = new MMMessageAssociationEnd<BuyIn3, FinancialInstrumentQuantity1Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmTransferredQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.BuyIn3.mmObject();
			isDerived = false;
			xmlTag = "CvrdQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoveredQuantity";
			definition = "Quantity amount covered by the clearing member after notification.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}

		@Override
		public FinancialInstrumentQuantity1Choice getValue(BuyIn3 obj) {
			return obj.getCoveredQuantity();
		}

		@Override
		public void setValue(BuyIn3 obj, FinancialInstrumentQuantity1Choice value) {
			obj.setCoveredQuantity(value);
		}
	};
	@XmlElement(name = "UcvrdQty", required = true)
	protected FinancialInstrumentQuantity1Choice uncoveredQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BuyIn#mmSecuritiesCompensation
	 * BuyIn.mmSecuritiesCompensation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.BuyIn3
	 * BuyIn3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UcvrdQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UncoveredQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity amount non covered by the clearing member after notification (this is, new buy in amount to be executed)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BuyIn3, FinancialInstrumentQuantity1Choice> mmUncoveredQuantity = new MMMessageAssociationEnd<BuyIn3, FinancialInstrumentQuantity1Choice>() {
		{
			businessElementTrace_lazy = () -> BuyIn.mmSecuritiesCompensation;
			componentContext_lazy = () -> com.tools20022.repository.msg.BuyIn3.mmObject();
			isDerived = false;
			xmlTag = "UcvrdQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UncoveredQuantity";
			definition = "Quantity amount non covered by the clearing member after notification (this is, new buy in amount to be executed).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}

		@Override
		public FinancialInstrumentQuantity1Choice getValue(BuyIn3 obj) {
			return obj.getUncoveredQuantity();
		}

		@Override
		public void setValue(BuyIn3 obj, FinancialInstrumentQuantity1Choice value) {
			obj.setUncoveredQuantity(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BuyIn3.mmBuyInNotificationIdentification, com.tools20022.repository.msg.BuyIn3.mmRequestForDelayIndicator,
						com.tools20022.repository.msg.BuyIn3.mmNumberOfDays, com.tools20022.repository.msg.BuyIn3.mmInitialQuantity, com.tools20022.repository.msg.BuyIn3.mmCoveredQuantity,
						com.tools20022.repository.msg.BuyIn3.mmUncoveredQuantity);
				messageBuildingBlock_lazy = () -> Arrays.asList(BuyInResponseV03.mmBuyInResponseDetails);
				trace_lazy = () -> BuyIn.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BuyIn3";
				definition = "Specifies elements related to the response sent by the clearing member to the central counterparty in the context of the buy in process.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getBuyInNotificationIdentification() {
		return buyInNotificationIdentification;
	}

	public BuyIn3 setBuyInNotificationIdentification(Max35Text buyInNotificationIdentification) {
		this.buyInNotificationIdentification = Objects.requireNonNull(buyInNotificationIdentification);
		return this;
	}

	public YesNoIndicator getRequestForDelayIndicator() {
		return requestForDelayIndicator;
	}

	public BuyIn3 setRequestForDelayIndicator(YesNoIndicator requestForDelayIndicator) {
		this.requestForDelayIndicator = Objects.requireNonNull(requestForDelayIndicator);
		return this;
	}

	public Number getNumberOfDays() {
		return numberOfDays;
	}

	public BuyIn3 setNumberOfDays(Number numberOfDays) {
		this.numberOfDays = Objects.requireNonNull(numberOfDays);
		return this;
	}

	public FinancialInstrumentQuantity1Choice getInitialQuantity() {
		return initialQuantity;
	}

	public BuyIn3 setInitialQuantity(FinancialInstrumentQuantity1Choice initialQuantity) {
		this.initialQuantity = Objects.requireNonNull(initialQuantity);
		return this;
	}

	public FinancialInstrumentQuantity1Choice getCoveredQuantity() {
		return coveredQuantity;
	}

	public BuyIn3 setCoveredQuantity(FinancialInstrumentQuantity1Choice coveredQuantity) {
		this.coveredQuantity = Objects.requireNonNull(coveredQuantity);
		return this;
	}

	public FinancialInstrumentQuantity1Choice getUncoveredQuantity() {
		return uncoveredQuantity;
	}

	public BuyIn3 setUncoveredQuantity(FinancialInstrumentQuantity1Choice uncoveredQuantity) {
		this.uncoveredQuantity = Objects.requireNonNull(uncoveredQuantity);
		return this;
	}
}