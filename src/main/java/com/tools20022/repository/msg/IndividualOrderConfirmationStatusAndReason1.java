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

import com.tools20022.metamodel.*;
import com.tools20022.repository.area.setr.OrderConfirmationStatusReportV01;
import com.tools20022.repository.choice.PartyIdentification2Choice;
import com.tools20022.repository.codeset.OrderConfirmationStatus1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ConfirmationRejectedStatus1;
import com.tools20022.repository.msg.FinancialInstrument10;
import com.tools20022.repository.msg.InvestmentAccount13;
import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Status report of the individual orders confirmation that was previously
 * received.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1#TypeOfStatusRule
 * IndividualOrderConfirmationStatusAndReason1.TypeOfStatusRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1#mmMasterReference
 * IndividualOrderConfirmationStatusAndReason1.mmMasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1#mmOrderReference
 * IndividualOrderConfirmationStatusAndReason1.mmOrderReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1#mmClientReference
 * IndividualOrderConfirmationStatusAndReason1.mmClientReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1#mmDealReference
 * IndividualOrderConfirmationStatusAndReason1.mmDealReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1#mmConfirmationRejected
 * IndividualOrderConfirmationStatusAndReason1.mmConfirmationRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1#mmAmendmentRejected
 * IndividualOrderConfirmationStatusAndReason1.mmAmendmentRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1#mmStatus
 * IndividualOrderConfirmationStatusAndReason1.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1#mmStatusInitiator
 * IndividualOrderConfirmationStatusAndReason1.mmStatusInitiator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1#mmInvestmentAccountDetails
 * IndividualOrderConfirmationStatusAndReason1.mmInvestmentAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1#mmFinancialInstrumentDetails
 * IndividualOrderConfirmationStatusAndReason1.mmFinancialInstrumentDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
 * InvestmentFundOrder}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderConfirmationStatusReportV01#mmIndividualOrderConfirmationDetailsReport
 * OrderConfirmationStatusReportV01.mmIndividualOrderConfirmationDetailsReport}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IndividualOrderConfirmationStatusAndReason1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Status report of the individual orders confirmation that was previously received."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2
 * IndividualOrderConfirmationStatusAndReason2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IndividualOrderConfirmationStatusAndReason1", propOrder = {"masterReference", "orderReference", "clientReference", "dealReference", "confirmationRejected", "amendmentRejected", "status", "statusInitiator",
		"investmentAccountDetails", "financialInstrumentDetails"})
public class IndividualOrderConfirmationStatusAndReason1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MstrRef")
	protected Max35Text masterReference;
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
	 * {@linkplain com.tools20022.repository.entity.Order#mmMasterIdentification
	 * Order.mmMasterIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1
	 * IndividualOrderConfirmationStatusAndReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MstrRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MasterReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference assigned to a set of orders or trades in order to link them together."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2#mmMasterReference
	 * IndividualOrderConfirmationStatusAndReason2.mmMasterReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IndividualOrderConfirmationStatusAndReason1, Optional<Max35Text>> mmMasterReference = new MMMessageAttribute<IndividualOrderConfirmationStatusAndReason1, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Order.mmMasterIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1.mmObject();
			isDerived = false;
			xmlTag = "MstrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterReference";
			definition = "Reference assigned to a set of orders or trades in order to link them together.";
			nextVersions_lazy = () -> Arrays.asList(IndividualOrderConfirmationStatusAndReason2.mmMasterReference);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(IndividualOrderConfirmationStatusAndReason1 obj) {
			return obj.getMasterReference();
		}

		@Override
		public void setValue(IndividualOrderConfirmationStatusAndReason1 obj, Optional<Max35Text> value) {
			obj.setMasterReference(value.orElse(null));
		}
	};
	@XmlElement(name = "OrdrRef", required = true)
	protected Max35Text orderReference;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmIdentification
	 * SecuritiesOrder.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1
	 * IndividualOrderConfirmationStatusAndReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for an order, as assigned by the instructing party."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2#mmOrderReference
	 * IndividualOrderConfirmationStatusAndReason2.mmOrderReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IndividualOrderConfirmationStatusAndReason1, Max35Text> mmOrderReference = new MMMessageAttribute<IndividualOrderConfirmationStatusAndReason1, Max35Text>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1.mmObject();
			isDerived = false;
			xmlTag = "OrdrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderReference";
			definition = "Unique and unambiguous identifier for an order, as assigned by the instructing party.";
			nextVersions_lazy = () -> Arrays.asList(IndividualOrderConfirmationStatusAndReason2.mmOrderReference);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(IndividualOrderConfirmationStatusAndReason1 obj) {
			return obj.getOrderReference();
		}

		@Override
		public void setValue(IndividualOrderConfirmationStatusAndReason1 obj, Max35Text value) {
			obj.setOrderReference(value);
		}
	};
	@XmlElement(name = "ClntRef")
	protected Max35Text clientReference;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmClientOrderIdentification
	 * SecuritiesOrder.mmClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1
	 * IndividualOrderConfirmationStatusAndReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClntRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous investor's identification of an order. This reference can typically be used in a hub scenario to give the reference of the order as assigned by the underlying client."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2#mmClientReference
	 * IndividualOrderConfirmationStatusAndReason2.mmClientReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IndividualOrderConfirmationStatusAndReason1, Optional<Max35Text>> mmClientReference = new MMMessageAttribute<IndividualOrderConfirmationStatusAndReason1, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmClientOrderIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1.mmObject();
			isDerived = false;
			xmlTag = "ClntRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientReference";
			definition = "Unique and unambiguous investor's identification of an order. This reference can typically be used in a hub scenario to give the reference of the order as assigned by the underlying client.";
			nextVersions_lazy = () -> Arrays.asList(IndividualOrderConfirmationStatusAndReason2.mmClientReference);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(IndividualOrderConfirmationStatusAndReason1 obj) {
			return obj.getClientReference();
		}

		@Override
		public void setValue(IndividualOrderConfirmationStatusAndReason1 obj, Optional<Max35Text> value) {
			obj.setClientReference(value.orElse(null));
		}
	};
	@XmlElement(name = "DealRef")
	protected Max35Text dealReference;
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
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1
	 * IndividualOrderConfirmationStatusAndReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DealRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for an order execution, as assigned by a confirming party."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2#mmDealReference
	 * IndividualOrderConfirmationStatusAndReason2.mmDealReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IndividualOrderConfirmationStatusAndReason1, Optional<Max35Text>> mmDealReference = new MMMessageAttribute<IndividualOrderConfirmationStatusAndReason1, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1.mmObject();
			isDerived = false;
			xmlTag = "DealRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealReference";
			definition = "Unique and unambiguous identifier for an order execution, as assigned by a confirming party.";
			nextVersions_lazy = () -> Arrays.asList(IndividualOrderConfirmationStatusAndReason2.mmDealReference);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(IndividualOrderConfirmationStatusAndReason1 obj) {
			return obj.getDealReference();
		}

		@Override
		public void setValue(IndividualOrderConfirmationStatusAndReason1 obj, Optional<Max35Text> value) {
			obj.setDealReference(value.orElse(null));
		}
	};
	@XmlElement(name = "ConfRjctd", required = true)
	protected List<ConfirmationRejectedStatus1> confirmationRejected;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationRejectedStatus1
	 * ConfirmationRejectedStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmOrderStatus
	 * InvestmentFundOrder.mmOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1
	 * IndividualOrderConfirmationStatusAndReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConfRjctd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationRejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the order confirmation is rejected."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IndividualOrderConfirmationStatusAndReason1, List<ConfirmationRejectedStatus1>> mmConfirmationRejected = new MMMessageAssociationEnd<IndividualOrderConfirmationStatusAndReason1, List<ConfirmationRejectedStatus1>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmOrderStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1.mmObject();
			isDerived = false;
			xmlTag = "ConfRjctd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationRejected";
			definition = "Status of the order confirmation is rejected.";
			maxOccurs = 10;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ConfirmationRejectedStatus1.mmObject();
		}

		@Override
		public List<ConfirmationRejectedStatus1> getValue(IndividualOrderConfirmationStatusAndReason1 obj) {
			return obj.getConfirmationRejected();
		}

		@Override
		public void setValue(IndividualOrderConfirmationStatusAndReason1 obj, List<ConfirmationRejectedStatus1> value) {
			obj.setConfirmationRejected(value);
		}
	};
	@XmlElement(name = "AmdmntRjctd", required = true)
	protected List<ConfirmationRejectedStatus1> amendmentRejected;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationRejectedStatus1
	 * ConfirmationRejectedStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmOrderStatus
	 * InvestmentFundOrder.mmOrderStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1
	 * IndividualOrderConfirmationStatusAndReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmdmntRjctd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmendmentRejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the order confirmation amendment is rejected."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IndividualOrderConfirmationStatusAndReason1, List<ConfirmationRejectedStatus1>> mmAmendmentRejected = new MMMessageAssociationEnd<IndividualOrderConfirmationStatusAndReason1, List<ConfirmationRejectedStatus1>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmOrderStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1.mmObject();
			isDerived = false;
			xmlTag = "AmdmntRjctd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmendmentRejected";
			definition = "Status of the order confirmation amendment is rejected.";
			maxOccurs = 10;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ConfirmationRejectedStatus1.mmObject();
		}

		@Override
		public List<ConfirmationRejectedStatus1> getValue(IndividualOrderConfirmationStatusAndReason1 obj) {
			return obj.getAmendmentRejected();
		}

		@Override
		public void setValue(IndividualOrderConfirmationStatusAndReason1 obj, List<ConfirmationRejectedStatus1> value) {
			obj.setAmendmentRejected(value);
		}
	};
	@XmlElement(name = "Sts", required = true)
	protected OrderConfirmationStatus1Code status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OrderConfirmationStatus1Code
	 * OrderConfirmationStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmConfirmationStatus
	 * SecuritiesOrderStatus.mmConfirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1
	 * IndividualOrderConfirmationStatusAndReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of the order confirmation is accepted or received or sent to next party or there is a communication problem with next party. There is no reason attached."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IndividualOrderConfirmationStatusAndReason1, OrderConfirmationStatus1Code> mmStatus = new MMMessageAttribute<IndividualOrderConfirmationStatusAndReason1, OrderConfirmationStatus1Code>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderStatus.mmConfirmationStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Status of the order confirmation is accepted or received or sent to next party or there is a communication problem with next party. There is no reason attached.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OrderConfirmationStatus1Code.mmObject();
		}

		@Override
		public OrderConfirmationStatus1Code getValue(IndividualOrderConfirmationStatusAndReason1 obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(IndividualOrderConfirmationStatusAndReason1 obj, OrderConfirmationStatus1Code value) {
			obj.setStatus(value);
		}
	};
	@XmlElement(name = "StsInitr")
	protected PartyIdentification2Choice statusInitiator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification2Choice
	 * PartyIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1
	 * IndividualOrderConfirmationStatusAndReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsInitr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusInitiator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that initiates the status of the order confirmation."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2#mmStatusInitiator
	 * IndividualOrderConfirmationStatusAndReason2.mmStatusInitiator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IndividualOrderConfirmationStatusAndReason1, Optional<PartyIdentification2Choice>> mmStatusInitiator = new MMMessageAssociationEnd<IndividualOrderConfirmationStatusAndReason1, Optional<PartyIdentification2Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1.mmObject();
			isDerived = false;
			xmlTag = "StsInitr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusInitiator";
			definition = "Party that initiates the status of the order confirmation.";
			nextVersions_lazy = () -> Arrays.asList(IndividualOrderConfirmationStatusAndReason2.mmStatusInitiator);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification2Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification2Choice> getValue(IndividualOrderConfirmationStatusAndReason1 obj) {
			return obj.getStatusInitiator();
		}

		@Override
		public void setValue(IndividualOrderConfirmationStatusAndReason1 obj, Optional<PartyIdentification2Choice> value) {
			obj.setStatusInitiator(value.orElse(null));
		}
	};
	@XmlElement(name = "InvstmtAcctDtls")
	protected InvestmentAccount13 investmentAccountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InvestmentAccount13
	 * InvestmentAccount13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentAccount
	 * InvestmentFundTransaction.mmInvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1
	 * IndividualOrderConfirmationStatusAndReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtAcctDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account information of the individual order confirmation for which the status is given."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2#mmInvestmentAccountDetails
	 * IndividualOrderConfirmationStatusAndReason2.mmInvestmentAccountDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IndividualOrderConfirmationStatusAndReason1, Optional<InvestmentAccount13>> mmInvestmentAccountDetails = new MMMessageAssociationEnd<IndividualOrderConfirmationStatusAndReason1, Optional<InvestmentAccount13>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmInvestmentAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1.mmObject();
			isDerived = false;
			xmlTag = "InvstmtAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccountDetails";
			definition = "Account information of the individual order confirmation for which the status is given.";
			nextVersions_lazy = () -> Arrays.asList(IndividualOrderConfirmationStatusAndReason2.mmInvestmentAccountDetails);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccount13.mmObject();
		}

		@Override
		public Optional<InvestmentAccount13> getValue(IndividualOrderConfirmationStatusAndReason1 obj) {
			return obj.getInvestmentAccountDetails();
		}

		@Override
		public void setValue(IndividualOrderConfirmationStatusAndReason1 obj, Optional<InvestmentAccount13> value) {
			obj.setInvestmentAccountDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "FinInstrmDtls")
	protected FinancialInstrument10 financialInstrumentDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstrument10
	 * FinancialInstrument10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentFundClass
	 * InvestmentFundTransaction.mmInvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1
	 * IndividualOrderConfirmationStatusAndReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instrument information of the individual order confirmation for which the status is given."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2#mmFinancialInstrumentDetails
	 * IndividualOrderConfirmationStatusAndReason2.mmFinancialInstrumentDetails}
	 * </li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IndividualOrderConfirmationStatusAndReason1, Optional<FinancialInstrument10>> mmFinancialInstrumentDetails = new MMMessageAssociationEnd<IndividualOrderConfirmationStatusAndReason1, Optional<FinancialInstrument10>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmInvestmentFundClass;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentDetails";
			definition = "Financial instrument information of the individual order confirmation for which the status is given.";
			nextVersions_lazy = () -> Arrays.asList(IndividualOrderConfirmationStatusAndReason2.mmFinancialInstrumentDetails);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrument10.mmObject();
		}

		@Override
		public Optional<FinancialInstrument10> getValue(IndividualOrderConfirmationStatusAndReason1 obj) {
			return obj.getFinancialInstrumentDetails();
		}

		@Override
		public void setValue(IndividualOrderConfirmationStatusAndReason1 obj, Optional<FinancialInstrument10> value) {
			obj.setFinancialInstrumentDetails(value.orElse(null));
		}
	};
	/**
	 * One and only one message element in the list (ConfirmationRejected,
	 * AmendmentRejected, Status) must be present. This message element may be
	 * repeated more than once if allowed by its multiplicity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1
	 * IndividualOrderConfirmationStatusAndReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1#mmConfirmationRejected
	 * IndividualOrderConfirmationStatusAndReason1.mmConfirmationRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1#mmAmendmentRejected
	 * IndividualOrderConfirmationStatusAndReason1.mmAmendmentRejected}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1#mmStatus
	 * IndividualOrderConfirmationStatusAndReason1.mmStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfStatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "One and only one message element in the list (ConfirmationRejected, AmendmentRejected, Status) must be present. This message element may be repeated more than once if allowed by its multiplicity."
	 * </li>
	 * </ul>
	 */
	public static final MMXor TypeOfStatusRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfStatusRule";
			definition = "One and only one message element in the list (ConfirmationRejected, AmendmentRejected, Status) must be present. This message element may be repeated more than once if allowed by its multiplicity.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1.mmConfirmationRejected,
					com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1.mmAmendmentRejected, com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1.mmStatus);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1.mmMasterReference,
						com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1.mmOrderReference, com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1.mmClientReference,
						com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1.mmDealReference, com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1.mmConfirmationRejected,
						com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1.mmAmendmentRejected, com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1.mmStatus,
						com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1.mmStatusInitiator, com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1.mmInvestmentAccountDetails,
						com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1.mmFinancialInstrumentDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(OrderConfirmationStatusReportV01.mmIndividualOrderConfirmationDetailsReport);
				trace_lazy = () -> InvestmentFundOrder.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "IndividualOrderConfirmationStatusAndReason1";
				definition = "Status report of the individual orders confirmation that was previously received.";
				nextVersions_lazy = () -> Arrays.asList(IndividualOrderConfirmationStatusAndReason2.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason1.TypeOfStatusRule);
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getMasterReference() {
		return masterReference == null ? Optional.empty() : Optional.of(masterReference);
	}

	public IndividualOrderConfirmationStatusAndReason1 setMasterReference(Max35Text masterReference) {
		this.masterReference = masterReference;
		return this;
	}

	public Max35Text getOrderReference() {
		return orderReference;
	}

	public IndividualOrderConfirmationStatusAndReason1 setOrderReference(Max35Text orderReference) {
		this.orderReference = Objects.requireNonNull(orderReference);
		return this;
	}

	public Optional<Max35Text> getClientReference() {
		return clientReference == null ? Optional.empty() : Optional.of(clientReference);
	}

	public IndividualOrderConfirmationStatusAndReason1 setClientReference(Max35Text clientReference) {
		this.clientReference = clientReference;
		return this;
	}

	public Optional<Max35Text> getDealReference() {
		return dealReference == null ? Optional.empty() : Optional.of(dealReference);
	}

	public IndividualOrderConfirmationStatusAndReason1 setDealReference(Max35Text dealReference) {
		this.dealReference = dealReference;
		return this;
	}

	public List<ConfirmationRejectedStatus1> getConfirmationRejected() {
		return confirmationRejected == null ? confirmationRejected = new ArrayList<>() : confirmationRejected;
	}

	public IndividualOrderConfirmationStatusAndReason1 setConfirmationRejected(List<ConfirmationRejectedStatus1> confirmationRejected) {
		this.confirmationRejected = Objects.requireNonNull(confirmationRejected);
		return this;
	}

	public List<ConfirmationRejectedStatus1> getAmendmentRejected() {
		return amendmentRejected == null ? amendmentRejected = new ArrayList<>() : amendmentRejected;
	}

	public IndividualOrderConfirmationStatusAndReason1 setAmendmentRejected(List<ConfirmationRejectedStatus1> amendmentRejected) {
		this.amendmentRejected = Objects.requireNonNull(amendmentRejected);
		return this;
	}

	public OrderConfirmationStatus1Code getStatus() {
		return status;
	}

	public IndividualOrderConfirmationStatusAndReason1 setStatus(OrderConfirmationStatus1Code status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public Optional<PartyIdentification2Choice> getStatusInitiator() {
		return statusInitiator == null ? Optional.empty() : Optional.of(statusInitiator);
	}

	public IndividualOrderConfirmationStatusAndReason1 setStatusInitiator(PartyIdentification2Choice statusInitiator) {
		this.statusInitiator = statusInitiator;
		return this;
	}

	public Optional<InvestmentAccount13> getInvestmentAccountDetails() {
		return investmentAccountDetails == null ? Optional.empty() : Optional.of(investmentAccountDetails);
	}

	public IndividualOrderConfirmationStatusAndReason1 setInvestmentAccountDetails(InvestmentAccount13 investmentAccountDetails) {
		this.investmentAccountDetails = investmentAccountDetails;
		return this;
	}

	public Optional<FinancialInstrument10> getFinancialInstrumentDetails() {
		return financialInstrumentDetails == null ? Optional.empty() : Optional.of(financialInstrumentDetails);
	}

	public IndividualOrderConfirmationStatusAndReason1 setFinancialInstrumentDetails(FinancialInstrument10 financialInstrumentDetails) {
		this.financialInstrumentDetails = financialInstrumentDetails;
		return this;
	}
}