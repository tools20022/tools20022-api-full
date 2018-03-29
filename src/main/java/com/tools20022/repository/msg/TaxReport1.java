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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.auth.InvoiceTaxReportV01;
import com.tools20022.repository.entity.BuyerRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Contains all needed party details for tax agency (sender of the TaxReport)
 * and tax authority (receiver of the TaxReport) and the details of the reported
 * sales transaction and calculated tax related that specific business
 * transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TaxReport1#mmTaxReportHeader
 * TaxReport1.mmTaxReportHeader}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxReport1#mmSeller
 * TaxReport1.mmSeller}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxReport1#mmBuyer
 * TaxReport1.mmBuyer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxReport1#mmTradeSettlement
 * TaxReport1.mmTradeSettlement}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxReport1#mmOtherParty
 * TaxReport1.mmOtherParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxReport1#mmAdditionalInformation
 * TaxReport1.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxReport1#mmAdditionalReference
 * TaxReport1.mmAdditionalReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxReport1#mmSupplementaryData
 * TaxReport1.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.BuyerRole BuyerRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.InvoiceTaxReportV01#mmTaxReport
 * InvoiceTaxReportV01.mmTaxReport}</li>
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
 * "TaxReport1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Contains all needed party details for tax agency (sender of the TaxReport) and tax authority (receiver of the TaxReport) and the details of the reported sales transaction and calculated tax related that specific business transaction."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TaxReportHeader1
 * TaxReportHeader1}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TaxReport1", propOrder = {"taxReportHeader", "seller", "buyer", "tradeSettlement", "otherParty", "additionalInformation", "additionalReference", "supplementaryData"})
public class TaxReport1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TaxRptHdr", required = true)
	protected GroupHeader69 taxReportHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.GroupHeader69
	 * GroupHeader69}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TaxReport1
	 * TaxReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxRptHdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxReportHeader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Basic report details."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TaxReport1, GroupHeader69> mmTaxReportHeader = new MMMessageAssociationEnd<TaxReport1, GroupHeader69>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxReport1.mmObject();
			isDerived = false;
			xmlTag = "TaxRptHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxReportHeader";
			definition = "Basic report details.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GroupHeader69.mmObject();
		}

		@Override
		public GroupHeader69 getValue(TaxReport1 obj) {
			return obj.getTaxReportHeader();
		}

		@Override
		public void setValue(TaxReport1 obj, GroupHeader69 value) {
			obj.setTaxReportHeader(value);
		}
	};
	@XmlElement(name = "Sellr", required = true)
	protected PartyIdentification72 seller;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification72
	 * PartyIdentification72}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TaxReport1
	 * TaxReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sellr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Seller"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax reporting agent, for example seller.\r\nResponsible to issue tax reporting to tax authority."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TaxReport1, PartyIdentification72> mmSeller = new MMMessageAssociationEnd<TaxReport1, PartyIdentification72>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxReport1.mmObject();
			isDerived = false;
			xmlTag = "Sellr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Seller";
			definition = "Tax reporting agent, for example seller.\r\nResponsible to issue tax reporting to tax authority.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification72.mmObject();
		}

		@Override
		public PartyIdentification72 getValue(TaxReport1 obj) {
			return obj.getSeller();
		}

		@Override
		public void setValue(TaxReport1 obj, PartyIdentification72 value) {
			obj.setSeller(value);
		}
	};
	@XmlElement(name = "Buyr")
	protected PartyIdentification72 buyer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification72
	 * PartyIdentification72}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.BuyerRole BuyerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TaxReport1
	 * TaxReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Buyr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Buyer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the buyer of goods/service reported in this message."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TaxReport1, Optional<PartyIdentification72>> mmBuyer = new MMMessageAssociationEnd<TaxReport1, Optional<PartyIdentification72>>() {
		{
			businessComponentTrace_lazy = () -> BuyerRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxReport1.mmObject();
			isDerived = false;
			xmlTag = "Buyr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Buyer";
			definition = "Specifies the buyer of goods/service reported in this message.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification72.mmObject();
		}

		@Override
		public Optional<PartyIdentification72> getValue(TaxReport1 obj) {
			return obj.getBuyer();
		}

		@Override
		public void setValue(TaxReport1 obj, Optional<PartyIdentification72> value) {
			obj.setBuyer(value.orElse(null));
		}
	};
	@XmlElement(name = "TradSttlm", required = true)
	protected TradeSettlement2 tradeSettlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradeSettlement2
	 * TradeSettlement2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TaxReport1
	 * TaxReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradSttlm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contains the details of the business transactions reported in the message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TaxReport1, TradeSettlement2> mmTradeSettlement = new MMMessageAssociationEnd<TaxReport1, TradeSettlement2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxReport1.mmObject();
			isDerived = false;
			xmlTag = "TradSttlm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeSettlement";
			definition = "Contains the details of the business transactions reported in the message.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TradeSettlement2.mmObject();
		}

		@Override
		public TradeSettlement2 getValue(TaxReport1 obj) {
			return obj.getTradeSettlement();
		}

		@Override
		public void setValue(TaxReport1 obj, TradeSettlement2 value) {
			obj.setTradeSettlement(value);
		}
	};
	@XmlElement(name = "OthrPty")
	protected List<PartyIdentification72> otherParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification72
	 * PartyIdentification72}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TaxReport1
	 * TaxReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reserved for parties that may be required by a specific tax authority."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TaxReport1, List<PartyIdentification72>> mmOtherParty = new MMMessageAssociationEnd<TaxReport1, List<PartyIdentification72>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxReport1.mmObject();
			isDerived = false;
			xmlTag = "OthrPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherParty";
			definition = "Reserved for parties that may be required by a specific tax authority.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification72.mmObject();
		}

		@Override
		public List<PartyIdentification72> getValue(TaxReport1 obj) {
			return obj.getOtherParty();
		}

		@Override
		public void setValue(TaxReport1 obj, List<PartyIdentification72> value) {
			obj.setOtherParty(value);
		}
	};
	@XmlElement(name = "AddtlInf")
	protected List<AdditionalInformation1> additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AdditionalInformation1
	 * AdditionalInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TaxReport1
	 * TaxReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional reference like site key or identifier."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TaxReport1, List<AdditionalInformation1>> mmAdditionalInformation = new MMMessageAssociationEnd<TaxReport1, List<AdditionalInformation1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxReport1.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional reference like site key or identifier.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AdditionalInformation1.mmObject();
		}

		@Override
		public List<AdditionalInformation1> getValue(TaxReport1 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(TaxReport1 obj, List<AdditionalInformation1> value) {
			obj.setAdditionalInformation(value);
		}
	};
	@XmlElement(name = "AddtlRef")
	protected List<DocumentGeneralInformation2> additionalReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation2
	 * DocumentGeneralInformation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TaxReport1
	 * TaxReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Structure to deliver link to external attachment or deliver base64-coded attachment inside message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TaxReport1, List<DocumentGeneralInformation2>> mmAdditionalReference = new MMMessageAssociationEnd<TaxReport1, List<DocumentGeneralInformation2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxReport1.mmObject();
			isDerived = false;
			xmlTag = "AddtlRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReference";
			definition = "Structure to deliver link to external attachment or deliver base64-coded attachment inside message.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DocumentGeneralInformation2.mmObject();
		}

		@Override
		public List<DocumentGeneralInformation2> getValue(TaxReport1 obj) {
			return obj.getAdditionalReference();
		}

		@Override
		public void setValue(TaxReport1 obj, List<DocumentGeneralInformation2> value) {
			obj.setAdditionalReference(value);
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TaxReport1
	 * TaxReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that can not be captured in the structured fields and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TaxReport1, List<SupplementaryData1>> mmSupplementaryData = new MMMessageAssociationEnd<TaxReport1, List<SupplementaryData1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxReport1.mmObject();
			isDerived = false;
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(TaxReport1 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(TaxReport1 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxReport1.mmTaxReportHeader, com.tools20022.repository.msg.TaxReport1.mmSeller, com.tools20022.repository.msg.TaxReport1.mmBuyer,
						com.tools20022.repository.msg.TaxReport1.mmTradeSettlement, com.tools20022.repository.msg.TaxReport1.mmOtherParty, com.tools20022.repository.msg.TaxReport1.mmAdditionalInformation,
						com.tools20022.repository.msg.TaxReport1.mmAdditionalReference, com.tools20022.repository.msg.TaxReport1.mmSupplementaryData);
				messageBuildingBlock_lazy = () -> Arrays.asList(InvoiceTaxReportV01.mmTaxReport);
				trace_lazy = () -> BuyerRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TaxReport1";
				definition = "Contains all needed party details for tax agency (sender of the TaxReport) and tax authority (receiver of the TaxReport) and the details of the reported sales transaction and calculated tax related that specific business transaction.";
				nextVersions_lazy = () -> Arrays.asList(TaxReportHeader1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public GroupHeader69 getTaxReportHeader() {
		return taxReportHeader;
	}

	public TaxReport1 setTaxReportHeader(GroupHeader69 taxReportHeader) {
		this.taxReportHeader = Objects.requireNonNull(taxReportHeader);
		return this;
	}

	public PartyIdentification72 getSeller() {
		return seller;
	}

	public TaxReport1 setSeller(PartyIdentification72 seller) {
		this.seller = Objects.requireNonNull(seller);
		return this;
	}

	public Optional<PartyIdentification72> getBuyer() {
		return buyer == null ? Optional.empty() : Optional.of(buyer);
	}

	public TaxReport1 setBuyer(PartyIdentification72 buyer) {
		this.buyer = buyer;
		return this;
	}

	public TradeSettlement2 getTradeSettlement() {
		return tradeSettlement;
	}

	public TaxReport1 setTradeSettlement(TradeSettlement2 tradeSettlement) {
		this.tradeSettlement = Objects.requireNonNull(tradeSettlement);
		return this;
	}

	public List<PartyIdentification72> getOtherParty() {
		return otherParty == null ? otherParty = new ArrayList<>() : otherParty;
	}

	public TaxReport1 setOtherParty(List<PartyIdentification72> otherParty) {
		this.otherParty = Objects.requireNonNull(otherParty);
		return this;
	}

	public List<AdditionalInformation1> getAdditionalInformation() {
		return additionalInformation == null ? additionalInformation = new ArrayList<>() : additionalInformation;
	}

	public TaxReport1 setAdditionalInformation(List<AdditionalInformation1> additionalInformation) {
		this.additionalInformation = Objects.requireNonNull(additionalInformation);
		return this;
	}

	public List<DocumentGeneralInformation2> getAdditionalReference() {
		return additionalReference == null ? additionalReference = new ArrayList<>() : additionalReference;
	}

	public TaxReport1 setAdditionalReference(List<DocumentGeneralInformation2> additionalReference) {
		this.additionalReference = Objects.requireNonNull(additionalReference);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public TaxReport1 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}
}