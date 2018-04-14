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
import com.tools20022.repository.area.tsin.FinancialInvoiceV01;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Consignment2;
import com.tools20022.repository.msg.DocumentIdentification22;
import com.tools20022.repository.msg.Period1;
import com.tools20022.repository.msg.TradeParty1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies how the supply chain shipping arrangements and the delivery of
 * products and/or services as well as related documentation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeDelivery1#mmDeliveryPeriod
 * TradeDelivery1.mmDeliveryPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeDelivery1#mmDeliveryDateTime
 * TradeDelivery1.mmDeliveryDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeDelivery1#mmShipFrom
 * TradeDelivery1.mmShipFrom}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeDelivery1#mmShipTo
 * TradeDelivery1.mmShipTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeDelivery1#mmUltimateShipTo
 * TradeDelivery1.mmUltimateShipTo}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeDelivery1#mmDeliveryNote
 * TradeDelivery1.mmDeliveryNote}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeDelivery1#mmConsignment
 * TradeDelivery1.mmConsignment}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ProductDelivery
 * ProductDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.FinancialInvoiceV01#mmTradeDelivery
 * FinancialInvoiceV01.mmTradeDelivery}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeDelivery1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies how the supply chain shipping arrangements and the delivery of products and/or services as well as related documentation."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TradeDelivery2 TradeDelivery2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TradeDelivery1", propOrder = {"deliveryPeriod", "deliveryDateTime", "shipFrom", "shipTo", "ultimateShipTo", "deliveryNote", "consignment"})
public class TradeDelivery1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DlvryPrd")
	protected Period1 deliveryPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Period1 Period1}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProductDelivery#mmDeliveryPeriod
	 * ProductDelivery.mmDeliveryPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeDelivery1 TradeDelivery1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvryPrd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Actual delivery period of the products and/or services."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeDelivery2#mmDeliveryPeriod
	 * TradeDelivery2.mmDeliveryPeriod}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeDelivery1, Optional<Period1>> mmDeliveryPeriod = new MMMessageAttribute<TradeDelivery1, Optional<Period1>>() {
		{
			businessElementTrace_lazy = () -> ProductDelivery.mmDeliveryPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeDelivery1.mmObject();
			isDerived = false;
			xmlTag = "DlvryPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryPeriod";
			definition = "Actual delivery period of the products and/or services.";
			nextVersions_lazy = () -> Arrays.asList(TradeDelivery2.mmDeliveryPeriod);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Period1.mmObject();
		}

		@Override
		public Optional<Period1> getValue(TradeDelivery1 obj) {
			return obj.getDeliveryPeriod();
		}

		@Override
		public void setValue(TradeDelivery1 obj, Optional<Period1> value) {
			obj.setDeliveryPeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "DlvryDtTm")
	protected ISODateTime deliveryDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment#mmDate
	 * ObligationFulfilment.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeDelivery1 TradeDelivery1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvryDtTm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Actual delivery date/time of the products and/or services."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeDelivery2#mmDeliveryDateTime
	 * TradeDelivery2.mmDeliveryDateTime}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeDelivery1, Optional<ISODateTime>> mmDeliveryDateTime = new MMMessageAttribute<TradeDelivery1, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> ObligationFulfilment.mmDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeDelivery1.mmObject();
			isDerived = false;
			xmlTag = "DlvryDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryDateTime";
			definition = "Actual delivery date/time of the products and/or services.";
			nextVersions_lazy = () -> Arrays.asList(TradeDelivery2.mmDeliveryDateTime);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(TradeDelivery1 obj) {
			return obj.getDeliveryDateTime();
		}

		@Override
		public void setValue(TradeDelivery1 obj, Optional<ISODateTime> value) {
			obj.setDeliveryDateTime(value.orElse(null));
		}
	};
	@XmlElement(name = "ShipFr")
	protected TradeParty1 shipFrom;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradeParty1
	 * TradeParty1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ShipFrom ShipFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeDelivery1 TradeDelivery1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShipFr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShipFrom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party from whom the goods are dispatched."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeDelivery2#mmShipFrom
	 * TradeDelivery2.mmShipFrom}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeDelivery1, Optional<TradeParty1>> mmShipFrom = new MMMessageAssociationEnd<TradeDelivery1, Optional<TradeParty1>>() {
		{
			businessComponentTrace_lazy = () -> ShipFrom.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeDelivery1.mmObject();
			isDerived = false;
			xmlTag = "ShipFr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShipFrom";
			definition = "Party from whom the goods are dispatched.";
			nextVersions_lazy = () -> Arrays.asList(TradeDelivery2.mmShipFrom);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TradeParty1.mmObject();
		}

		@Override
		public Optional<TradeParty1> getValue(TradeDelivery1 obj) {
			return obj.getShipFrom();
		}

		@Override
		public void setValue(TradeDelivery1 obj, Optional<TradeParty1> value) {
			obj.setShipFrom(value.orElse(null));
		}
	};
	@XmlElement(name = "ShipTo")
	protected TradeParty1 shipTo;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradeParty1
	 * TradeParty1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ShipTo ShipTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeDelivery1 TradeDelivery1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShipTo"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShipTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party to whom the goods are dispatched."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeDelivery2#mmShipTo
	 * TradeDelivery2.mmShipTo}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeDelivery1, Optional<TradeParty1>> mmShipTo = new MMMessageAssociationEnd<TradeDelivery1, Optional<TradeParty1>>() {
		{
			businessComponentTrace_lazy = () -> ShipTo.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeDelivery1.mmObject();
			isDerived = false;
			xmlTag = "ShipTo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShipTo";
			definition = "Party to whom the goods are dispatched.";
			nextVersions_lazy = () -> Arrays.asList(TradeDelivery2.mmShipTo);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TradeParty1.mmObject();
		}

		@Override
		public Optional<TradeParty1> getValue(TradeDelivery1 obj) {
			return obj.getShipTo();
		}

		@Override
		public void setValue(TradeDelivery1 obj, Optional<TradeParty1> value) {
			obj.setShipTo(value.orElse(null));
		}
	};
	@XmlElement(name = "UltmtShipTo")
	protected TradeParty1 ultimateShipTo;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradeParty1
	 * TradeParty1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ShipTo ShipTo}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeDelivery1 TradeDelivery1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UltmtShipTo"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateShipTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Final party to whom the goods are dispatched."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeDelivery2#mmUltimateShipTo
	 * TradeDelivery2.mmUltimateShipTo}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeDelivery1, Optional<TradeParty1>> mmUltimateShipTo = new MMMessageAssociationEnd<TradeDelivery1, Optional<TradeParty1>>() {
		{
			businessComponentTrace_lazy = () -> ShipTo.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeDelivery1.mmObject();
			isDerived = false;
			xmlTag = "UltmtShipTo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateShipTo";
			definition = "Final party to whom the goods are dispatched.";
			nextVersions_lazy = () -> Arrays.asList(TradeDelivery2.mmUltimateShipTo);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TradeParty1.mmObject();
		}

		@Override
		public Optional<TradeParty1> getValue(TradeDelivery1 obj) {
			return obj.getUltimateShipTo();
		}

		@Override
		public void setValue(TradeDelivery1 obj, Optional<TradeParty1> value) {
			obj.setUltimateShipTo(value.orElse(null));
		}
	};
	@XmlElement(name = "DlvryNote")
	protected DocumentIdentification22 deliveryNote;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification22
	 * DocumentIdentification22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.DeliveryNote DeliveryNote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeDelivery1 TradeDelivery1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvryNote"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Delivery note related to the delivery of the products and/or services."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeDelivery2#mmDeliveryNote
	 * TradeDelivery2.mmDeliveryNote}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeDelivery1, Optional<DocumentIdentification22>> mmDeliveryNote = new MMMessageAttribute<TradeDelivery1, Optional<DocumentIdentification22>>() {
		{
			businessComponentTrace_lazy = () -> DeliveryNote.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeDelivery1.mmObject();
			isDerived = false;
			xmlTag = "DlvryNote";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryNote";
			definition = "Delivery note related to the delivery of the products and/or services.";
			nextVersions_lazy = () -> Arrays.asList(TradeDelivery2.mmDeliveryNote);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification22.mmObject();
		}

		@Override
		public Optional<DocumentIdentification22> getValue(TradeDelivery1 obj) {
			return obj.getDeliveryNote();
		}

		@Override
		public void setValue(TradeDelivery1 obj, Optional<DocumentIdentification22> value) {
			obj.setDeliveryNote(value.orElse(null));
		}
	};
	@XmlElement(name = "Consgnmt")
	protected List<Consignment2> consignment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Consignment2
	 * Consignment2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProductDelivery#mmRouting
	 * ProductDelivery.mmRouting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeDelivery1 TradeDelivery1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Consgnmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Consignment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Physical consolidation of goods for transport."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeDelivery2#mmConsignment
	 * TradeDelivery2.mmConsignment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeDelivery1, List<Consignment2>> mmConsignment = new MMMessageAssociationEnd<TradeDelivery1, List<Consignment2>>() {
		{
			businessElementTrace_lazy = () -> ProductDelivery.mmRouting;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeDelivery1.mmObject();
			isDerived = false;
			xmlTag = "Consgnmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Consignment";
			definition = "Physical consolidation of goods for transport.";
			nextVersions_lazy = () -> Arrays.asList(TradeDelivery2.mmConsignment);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Consignment2.mmObject();
		}

		@Override
		public List<Consignment2> getValue(TradeDelivery1 obj) {
			return obj.getConsignment();
		}

		@Override
		public void setValue(TradeDelivery1 obj, List<Consignment2> value) {
			obj.setConsignment(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeDelivery1.mmDeliveryPeriod, com.tools20022.repository.msg.TradeDelivery1.mmDeliveryDateTime,
						com.tools20022.repository.msg.TradeDelivery1.mmShipFrom, com.tools20022.repository.msg.TradeDelivery1.mmShipTo, com.tools20022.repository.msg.TradeDelivery1.mmUltimateShipTo,
						com.tools20022.repository.msg.TradeDelivery1.mmDeliveryNote, com.tools20022.repository.msg.TradeDelivery1.mmConsignment);
				messageBuildingBlock_lazy = () -> Arrays.asList(FinancialInvoiceV01.mmTradeDelivery);
				trace_lazy = () -> ProductDelivery.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradeDelivery1";
				definition = "Specifies how the supply chain shipping arrangements and the delivery of products and/or services as well as related documentation.";
				nextVersions_lazy = () -> Arrays.asList(TradeDelivery2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Period1> getDeliveryPeriod() {
		return deliveryPeriod == null ? Optional.empty() : Optional.of(deliveryPeriod);
	}

	public TradeDelivery1 setDeliveryPeriod(Period1 deliveryPeriod) {
		this.deliveryPeriod = deliveryPeriod;
		return this;
	}

	public Optional<ISODateTime> getDeliveryDateTime() {
		return deliveryDateTime == null ? Optional.empty() : Optional.of(deliveryDateTime);
	}

	public TradeDelivery1 setDeliveryDateTime(ISODateTime deliveryDateTime) {
		this.deliveryDateTime = deliveryDateTime;
		return this;
	}

	public Optional<TradeParty1> getShipFrom() {
		return shipFrom == null ? Optional.empty() : Optional.of(shipFrom);
	}

	public TradeDelivery1 setShipFrom(TradeParty1 shipFrom) {
		this.shipFrom = shipFrom;
		return this;
	}

	public Optional<TradeParty1> getShipTo() {
		return shipTo == null ? Optional.empty() : Optional.of(shipTo);
	}

	public TradeDelivery1 setShipTo(TradeParty1 shipTo) {
		this.shipTo = shipTo;
		return this;
	}

	public Optional<TradeParty1> getUltimateShipTo() {
		return ultimateShipTo == null ? Optional.empty() : Optional.of(ultimateShipTo);
	}

	public TradeDelivery1 setUltimateShipTo(TradeParty1 ultimateShipTo) {
		this.ultimateShipTo = ultimateShipTo;
		return this;
	}

	public Optional<DocumentIdentification22> getDeliveryNote() {
		return deliveryNote == null ? Optional.empty() : Optional.of(deliveryNote);
	}

	public TradeDelivery1 setDeliveryNote(DocumentIdentification22 deliveryNote) {
		this.deliveryNote = deliveryNote;
		return this;
	}

	public List<Consignment2> getConsignment() {
		return consignment == null ? consignment = new ArrayList<>() : consignment;
	}

	public TradeDelivery1 setConsignment(List<Consignment2> consignment) {
		this.consignment = Objects.requireNonNull(consignment);
		return this;
	}
}