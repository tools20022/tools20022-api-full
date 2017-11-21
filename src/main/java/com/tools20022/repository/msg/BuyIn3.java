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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "BuyIn3", propOrder = {"buyInNotificationIdentification", "requestForDelayIndicator", "numberOfDays", "initialQuantity", "coveredQuantity", "uncoveredQuantity"})
public class BuyIn3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text buyInNotificationIdentification;
	/**
	 * Indicates the reference of the BuyInNotification message.
	 * <p>
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
	public static final MMMessageAttribute mmBuyInNotificationIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BuyIn3.mmObject();
			isDerived = false;
			xmlTag = "BuyInNtfctnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyInNotificationIdentification";
			definition = "Indicates the reference of the BuyInNotification message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected YesNoIndicator requestForDelayIndicator;
	/**
	 * Specific continuous net settlement case where the central counterparty
	 * can call for buy-in at a date anterior to "theoretical" buy-in date, the
	 * clearing member may request a delay.
	 * <p>
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
	public static final MMMessageAttribute mmRequestForDelayIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BuyIn3.mmObject();
			isDerived = false;
			xmlTag = "ReqForDelyInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestForDelayIndicator";
			definition = "Specific continuous net settlement case where the central counterparty can call for buy-in at a date anterior to \"theoretical\" buy-in date, the clearing member may request a delay.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected Number numberOfDays;
	/**
	 * Number of days associated to the request for delay.
	 * <p>
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
	public static final MMMessageAttribute mmNumberOfDays = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BuyIn3.mmObject();
			isDerived = false;
			xmlTag = "NbOfDays";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfDays";
			definition = "Number of days associated to the request for delay.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected FinancialInstrumentQuantity1Choice initialQuantity;
	/**
	 * Buy in quantity called initially by the central counterparty.
	 * <p>
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
	public static final MMMessageAssociationEnd mmInitialQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> BuyIn.mmSecuritiesCompensation;
			componentContext_lazy = () -> BuyIn3.mmObject();
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
	};
	protected FinancialInstrumentQuantity1Choice coveredQuantity;
	/**
	 * Quantity amount covered by the clearing member after notification.
	 * <p>
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
	public static final MMMessageAssociationEnd mmCoveredQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmTransferredQuantity;
			componentContext_lazy = () -> BuyIn3.mmObject();
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
	};
	protected FinancialInstrumentQuantity1Choice uncoveredQuantity;
	/**
	 * Quantity amount non covered by the clearing member after notification
	 * (this is, new buy in amount to be executed).
	 * <p>
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
	public static final MMMessageAssociationEnd mmUncoveredQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> BuyIn.mmSecuritiesCompensation;
			componentContext_lazy = () -> BuyIn3.mmObject();
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
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(BuyIn3.mmBuyInNotificationIdentification, BuyIn3.mmRequestForDelayIndicator, BuyIn3.mmNumberOfDays, BuyIn3.mmInitialQuantity, BuyIn3.mmCoveredQuantity, BuyIn3.mmUncoveredQuantity);
				messageBuildingBlock_lazy = () -> Arrays.asList(BuyInResponseV03.mmBuyInResponseDetails);
				trace_lazy = () -> BuyIn.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BuyIn3";
				definition = "Specifies elements related to the response sent by the clearing member to the central counterparty in the context of the buy in process.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "BuyInNtfctnId", required = true)
	public Max35Text getBuyInNotificationIdentification() {
		return buyInNotificationIdentification;
	}

	public void setBuyInNotificationIdentification(Max35Text buyInNotificationIdentification) {
		this.buyInNotificationIdentification = buyInNotificationIdentification;
	}

	@XmlElement(name = "ReqForDelyInd", required = true)
	public YesNoIndicator getRequestForDelayIndicator() {
		return requestForDelayIndicator;
	}

	public void setRequestForDelayIndicator(YesNoIndicator requestForDelayIndicator) {
		this.requestForDelayIndicator = requestForDelayIndicator;
	}

	@XmlElement(name = "NbOfDays", required = true)
	public Number getNumberOfDays() {
		return numberOfDays;
	}

	public void setNumberOfDays(Number numberOfDays) {
		this.numberOfDays = numberOfDays;
	}

	@XmlElement(name = "InitlQty", required = true)
	public FinancialInstrumentQuantity1Choice getInitialQuantity() {
		return initialQuantity;
	}

	public void setInitialQuantity(FinancialInstrumentQuantity1Choice initialQuantity) {
		this.initialQuantity = initialQuantity;
	}

	@XmlElement(name = "CvrdQty", required = true)
	public FinancialInstrumentQuantity1Choice getCoveredQuantity() {
		return coveredQuantity;
	}

	public void setCoveredQuantity(FinancialInstrumentQuantity1Choice coveredQuantity) {
		this.coveredQuantity = coveredQuantity;
	}

	@XmlElement(name = "UcvrdQty", required = true)
	public FinancialInstrumentQuantity1Choice getUncoveredQuantity() {
		return uncoveredQuantity;
	}

	public void setUncoveredQuantity(FinancialInstrumentQuantity1Choice uncoveredQuantity) {
		this.uncoveredQuantity = uncoveredQuantity;
	}
}