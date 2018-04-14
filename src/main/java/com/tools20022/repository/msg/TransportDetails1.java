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
import com.tools20022.repository.choice.TransportMeans2Choice;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.ShipmentDateRange;
import com.tools20022.repository.entity.Transport;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Charge13;
import com.tools20022.repository.msg.DocumentIdentification7;
import com.tools20022.repository.msg.Incoterms2;
import com.tools20022.repository.msg.TransportedGoods1;
import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information on the shipment date, the charges, the routing and the goods
 * described in the transport document.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportDetails1#ProposedShipmentOrActualShipmentDateRule
 * TransportDetails1.ProposedShipmentOrActualShipmentDateRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportDetails1#mmTransportDocumentReference
 * TransportDetails1.mmTransportDocumentReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportDetails1#mmTransportedGoods
 * TransportDetails1.mmTransportedGoods}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportDetails1#mmRoutingSummary
 * TransportDetails1.mmRoutingSummary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportDetails1#mmProposedShipmentDate
 * TransportDetails1.mmProposedShipmentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportDetails1#mmActualShipmentDate
 * TransportDetails1.mmActualShipmentDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportDetails1#mmIncoterms
 * TransportDetails1.mmIncoterms}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportDetails1#mmFreightCharges
 * TransportDetails1.mmFreightCharges}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Transport Transport}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransportDetails1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information on the shipment date, the charges, the routing and the goods described in the transport document."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransportDetails1", propOrder = {"transportDocumentReference", "transportedGoods", "routingSummary", "proposedShipmentDate", "actualShipmentDate", "incoterms", "freightCharges"})
public class TransportDetails1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TrnsprtDocRef", required = true)
	protected List<DocumentIdentification7> transportDocumentReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification7
	 * DocumentIdentification7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportDetails1
	 * TransportDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrnsprtDocRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransportDocumentReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the identification of the underlying transport document."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransportDetails1, List<DocumentIdentification7>> mmTransportDocumentReference = new MMMessageAssociationEnd<TransportDetails1, List<DocumentIdentification7>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransportDetails1.mmObject();
			isDerived = false;
			xmlTag = "TrnsprtDocRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransportDocumentReference";
			definition = "Reference to the identification of the underlying transport document.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DocumentIdentification7.mmObject();
		}

		@Override
		public List<DocumentIdentification7> getValue(TransportDetails1 obj) {
			return obj.getTransportDocumentReference();
		}

		@Override
		public void setValue(TransportDetails1 obj, List<DocumentIdentification7> value) {
			obj.setTransportDocumentReference(value);
		}
	};
	@XmlElement(name = "TrnsprtdGoods", required = true)
	protected List<TransportedGoods1> transportedGoods;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransportedGoods1
	 * TransportedGoods1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmTransportedGoods
	 * Transport.mmTransportedGoods}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportDetails1
	 * TransportDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrnsprtdGoods"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransportedGoods"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Goods that are transported."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransportDetails1, List<TransportedGoods1>> mmTransportedGoods = new MMMessageAssociationEnd<TransportDetails1, List<TransportedGoods1>>() {
		{
			businessElementTrace_lazy = () -> Transport.mmTransportedGoods;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransportDetails1.mmObject();
			isDerived = false;
			xmlTag = "TrnsprtdGoods";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransportedGoods";
			definition = "Goods that are transported.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TransportedGoods1.mmObject();
		}

		@Override
		public List<TransportedGoods1> getValue(TransportDetails1 obj) {
			return obj.getTransportedGoods();
		}

		@Override
		public void setValue(TransportDetails1 obj, List<TransportedGoods1> value) {
			obj.setTransportedGoods(value);
		}
	};
	@XmlElement(name = "RtgSummry", required = true)
	protected TransportMeans2Choice routingSummary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TransportMeans2Choice
	 * TransportMeans2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportDetails1
	 * TransportDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RtgSummry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoutingSummary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to the conveyance of goods."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransportDetails1, TransportMeans2Choice> mmRoutingSummary = new MMMessageAssociationEnd<TransportDetails1, TransportMeans2Choice>() {
		{
			businessComponentTrace_lazy = () -> Transport.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TransportDetails1.mmObject();
			isDerived = false;
			xmlTag = "RtgSummry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoutingSummary";
			definition = "Information related to the conveyance of goods.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TransportMeans2Choice.mmObject();
		}

		@Override
		public TransportMeans2Choice getValue(TransportDetails1 obj) {
			return obj.getRoutingSummary();
		}

		@Override
		public void setValue(TransportDetails1 obj, TransportMeans2Choice value) {
			obj.setRoutingSummary(value);
		}
	};
	@XmlElement(name = "PropsdShipmntDt", required = true)
	protected ISODate proposedShipmentDate;
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
	 * {@linkplain com.tools20022.repository.entity.ShipmentDateRange#mmShipmentDate
	 * ShipmentDateRange.mmShipmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportDetails1
	 * TransportDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PropsdShipmntDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProposedShipmentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Proposed date on which the goods should be shipped."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransportDetails1, ISODate> mmProposedShipmentDate = new MMMessageAttribute<TransportDetails1, ISODate>() {
		{
			businessElementTrace_lazy = () -> ShipmentDateRange.mmShipmentDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransportDetails1.mmObject();
			isDerived = false;
			xmlTag = "PropsdShipmntDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProposedShipmentDate";
			definition = "Proposed date on which the goods should be shipped.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(TransportDetails1 obj) {
			return obj.getProposedShipmentDate();
		}

		@Override
		public void setValue(TransportDetails1 obj, ISODate value) {
			obj.setProposedShipmentDate(value);
		}
	};
	@XmlElement(name = "ActlShipmntDt", required = true)
	protected ISODate actualShipmentDate;
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
	 * {@linkplain com.tools20022.repository.entity.ShipmentDateRange#mmShipmentDate
	 * ShipmentDateRange.mmShipmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportDetails1
	 * TransportDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActlShipmntDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActualShipmentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Actual date whereby the goods were shipped."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransportDetails1, ISODate> mmActualShipmentDate = new MMMessageAttribute<TransportDetails1, ISODate>() {
		{
			businessElementTrace_lazy = () -> ShipmentDateRange.mmShipmentDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransportDetails1.mmObject();
			isDerived = false;
			xmlTag = "ActlShipmntDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActualShipmentDate";
			definition = "Actual date whereby the goods were shipped.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(TransportDetails1 obj) {
			return obj.getActualShipmentDate();
		}

		@Override
		public void setValue(TransportDetails1 obj, ISODate value) {
			obj.setActualShipmentDate(value);
		}
	};
	@XmlElement(name = "Incotrms")
	protected Incoterms2 incoterms;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Incoterms2 Incoterms2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmIncoterms
	 * Transport.mmIncoterms}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportDetails1
	 * TransportDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Incotrms"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Incoterms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the applicable Incoterm and associated location."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransportDetails1, Optional<Incoterms2>> mmIncoterms = new MMMessageAssociationEnd<TransportDetails1, Optional<Incoterms2>>() {
		{
			businessElementTrace_lazy = () -> Transport.mmIncoterms;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransportDetails1.mmObject();
			isDerived = false;
			xmlTag = "Incotrms";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Incoterms";
			definition = "Specifies the applicable Incoterm and associated location.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Incoterms2.mmObject();
		}

		@Override
		public Optional<Incoterms2> getValue(TransportDetails1 obj) {
			return obj.getIncoterms();
		}

		@Override
		public void setValue(TransportDetails1 obj, Optional<Incoterms2> value) {
			obj.setIncoterms(value.orElse(null));
		}
	};
	@XmlElement(name = "FrghtChrgs")
	protected Charge13 freightCharges;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Charge13 Charge13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmTransportCharges
	 * Transport.mmTransportCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportDetails1
	 * TransportDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrghtChrgs"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FreightCharges"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Charges related to the conveyance of goods."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransportDetails1, Optional<Charge13>> mmFreightCharges = new MMMessageAssociationEnd<TransportDetails1, Optional<Charge13>>() {
		{
			businessElementTrace_lazy = () -> Transport.mmTransportCharges;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransportDetails1.mmObject();
			isDerived = false;
			xmlTag = "FrghtChrgs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FreightCharges";
			definition = "Charges related to the conveyance of goods.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Charge13.mmObject();
		}

		@Override
		public Optional<Charge13> getValue(TransportDetails1 obj) {
			return obj.getFreightCharges();
		}

		@Override
		public void setValue(TransportDetails1 obj, Optional<Charge13> value) {
			obj.setFreightCharges(value.orElse(null));
		}
	};
	/**
	 * If ActualShipmentDate is present, then ProposedShipmentDate is not
	 * allowed. If ActualShipmentDate is not present, then ProposedShipmentDate
	 * is mandatory.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.TransportDetails1
	 * TransportDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportDetails1#mmProposedShipmentDate
	 * TransportDetails1.mmProposedShipmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportDetails1#mmActualShipmentDate
	 * TransportDetails1.mmActualShipmentDate}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProposedShipmentOrActualShipmentDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ActualShipmentDate is present, then ProposedShipmentDate is not allowed. If ActualShipmentDate is not present, then ProposedShipmentDate is mandatory."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMXor ProposedShipmentOrActualShipmentDateRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProposedShipmentOrActualShipmentDateRule";
			definition = "If ActualShipmentDate is present, then ProposedShipmentDate is not allowed. If ActualShipmentDate is not present, then ProposedShipmentDate is mandatory.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.TransportDetails1.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransportDetails1.mmProposedShipmentDate, com.tools20022.repository.msg.TransportDetails1.mmActualShipmentDate);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransportDetails1.mmTransportDocumentReference, com.tools20022.repository.msg.TransportDetails1.mmTransportedGoods,
						com.tools20022.repository.msg.TransportDetails1.mmRoutingSummary, com.tools20022.repository.msg.TransportDetails1.mmProposedShipmentDate, com.tools20022.repository.msg.TransportDetails1.mmActualShipmentDate,
						com.tools20022.repository.msg.TransportDetails1.mmIncoterms, com.tools20022.repository.msg.TransportDetails1.mmFreightCharges);
				trace_lazy = () -> Transport.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "TransportDetails1";
				definition = "Information on the shipment date, the charges, the routing and the goods described in the transport document.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransportDetails1.ProposedShipmentOrActualShipmentDateRule);
			}
		});
		return mmObject_lazy.get();
	}

	public List<DocumentIdentification7> getTransportDocumentReference() {
		return transportDocumentReference == null ? transportDocumentReference = new ArrayList<>() : transportDocumentReference;
	}

	public TransportDetails1 setTransportDocumentReference(List<DocumentIdentification7> transportDocumentReference) {
		this.transportDocumentReference = Objects.requireNonNull(transportDocumentReference);
		return this;
	}

	public List<TransportedGoods1> getTransportedGoods() {
		return transportedGoods == null ? transportedGoods = new ArrayList<>() : transportedGoods;
	}

	public TransportDetails1 setTransportedGoods(List<TransportedGoods1> transportedGoods) {
		this.transportedGoods = Objects.requireNonNull(transportedGoods);
		return this;
	}

	public TransportMeans2Choice getRoutingSummary() {
		return routingSummary;
	}

	public TransportDetails1 setRoutingSummary(TransportMeans2Choice routingSummary) {
		this.routingSummary = Objects.requireNonNull(routingSummary);
		return this;
	}

	public ISODate getProposedShipmentDate() {
		return proposedShipmentDate;
	}

	public TransportDetails1 setProposedShipmentDate(ISODate proposedShipmentDate) {
		this.proposedShipmentDate = Objects.requireNonNull(proposedShipmentDate);
		return this;
	}

	public ISODate getActualShipmentDate() {
		return actualShipmentDate;
	}

	public TransportDetails1 setActualShipmentDate(ISODate actualShipmentDate) {
		this.actualShipmentDate = Objects.requireNonNull(actualShipmentDate);
		return this;
	}

	public Optional<Incoterms2> getIncoterms() {
		return incoterms == null ? Optional.empty() : Optional.of(incoterms);
	}

	public TransportDetails1 setIncoterms(Incoterms2 incoterms) {
		this.incoterms = incoterms;
		return this;
	}

	public Optional<Charge13> getFreightCharges() {
		return freightCharges == null ? Optional.empty() : Optional.of(freightCharges);
	}

	public TransportDetails1 setFreightCharges(Charge13 freightCharges) {
		this.freightCharges = freightCharges;
		return this;
	}
}