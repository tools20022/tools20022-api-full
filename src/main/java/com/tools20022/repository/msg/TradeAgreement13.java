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
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DocumentGeneralInformation2;
import com.tools20022.repository.msg.DocumentIdentification22;
import com.tools20022.repository.msg.Incoterms3;
import com.tools20022.repository.msg.TradeParty3;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Contractual details related to the agreement between parties.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TradeAgreement13#mmBuyer
 * TradeAgreement13.mmBuyer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeAgreement13#mmSeller
 * TradeAgreement13.mmSeller}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeAgreement13#mmQuotationDocumentIdentification
 * TradeAgreement13.mmQuotationDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeAgreement13#mmContractDocumentIdentification
 * TradeAgreement13.mmContractDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeAgreement13#mmBuyerOrderIdentificationDocument
 * TradeAgreement13.mmBuyerOrderIdentificationDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeAgreement13#mmAdditionalReferenceDocument
 * TradeAgreement13.mmAdditionalReferenceDocument}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeAgreement13#mmIncoterms
 * TradeAgreement13.mmIncoterms}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Agreement Agreement}</li>
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
 * "TradeAgreement13"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Contractual details related to the agreement between parties."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TradeAgreement16
 * TradeAgreement16}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.TradeAgreement6
 * TradeAgreement6}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TradeAgreement13", propOrder = {"buyer", "seller", "quotationDocumentIdentification", "contractDocumentIdentification", "buyerOrderIdentificationDocument", "additionalReferenceDocument", "incoterms"})
public class TradeAgreement13 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Buyr", required = true)
	protected TradeParty3 buyer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradeParty3
	 * TradeParty3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.BuyerRole BuyerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement13
	 * TradeAgreement13}</li>
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
	 * "Party that is specified as the buyer for this trade agreement."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeAgreement16#mmBuyer
	 * TradeAgreement16.mmBuyer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement6#mmBuyer
	 * TradeAgreement6.mmBuyer}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeAgreement13, TradeParty3> mmBuyer = new MMMessageAssociationEnd<TradeAgreement13, TradeParty3>() {
		{
			businessComponentTrace_lazy = () -> BuyerRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeAgreement13.mmObject();
			isDerived = false;
			xmlTag = "Buyr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Buyer";
			definition = "Party that is specified as the buyer for this trade agreement.";
			nextVersions_lazy = () -> Arrays.asList(TradeAgreement16.mmBuyer);
			previousVersion_lazy = () -> TradeAgreement6.mmBuyer;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TradeParty3.mmObject();
		}

		@Override
		public TradeParty3 getValue(TradeAgreement13 obj) {
			return obj.getBuyer();
		}

		@Override
		public void setValue(TradeAgreement13 obj, TradeParty3 value) {
			obj.setBuyer(value);
		}
	};
	@XmlElement(name = "Sellr", required = true)
	protected TradeParty3 seller;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradeParty3
	 * TradeParty3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SellerRole SellerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement13
	 * TradeAgreement13}</li>
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
	 * "Party that is specified as the seller for this trade agreement."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeAgreement16#mmSeller
	 * TradeAgreement16.mmSeller}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement6#mmSeller
	 * TradeAgreement6.mmSeller}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeAgreement13, TradeParty3> mmSeller = new MMMessageAssociationEnd<TradeAgreement13, TradeParty3>() {
		{
			businessComponentTrace_lazy = () -> SellerRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeAgreement13.mmObject();
			isDerived = false;
			xmlTag = "Sellr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Seller";
			definition = "Party that is specified as the seller for this trade agreement.";
			nextVersions_lazy = () -> Arrays.asList(TradeAgreement16.mmSeller);
			previousVersion_lazy = () -> TradeAgreement6.mmSeller;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TradeParty3.mmObject();
		}

		@Override
		public TradeParty3 getValue(TradeAgreement13 obj) {
			return obj.getSeller();
		}

		@Override
		public void setValue(TradeAgreement13 obj, TradeParty3 value) {
			obj.setSeller(value);
		}
	};
	@XmlElement(name = "QtnDocId")
	protected DocumentIdentification22 quotationDocumentIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement13
	 * TradeAgreement13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtnDocId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuotationDocumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quotation document referenced from this trade agreement."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement16#mmQuotationDocumentIdentification
	 * TradeAgreement16.mmQuotationDocumentIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement6#mmQuotationDocumentIdentification
	 * TradeAgreement6.mmQuotationDocumentIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeAgreement13, Optional<DocumentIdentification22>> mmQuotationDocumentIdentification = new MMMessageAttribute<TradeAgreement13, Optional<DocumentIdentification22>>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeAgreement13.mmObject();
			isDerived = false;
			xmlTag = "QtnDocId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuotationDocumentIdentification";
			definition = "Quotation document referenced from this trade agreement.";
			nextVersions_lazy = () -> Arrays.asList(TradeAgreement16.mmQuotationDocumentIdentification);
			previousVersion_lazy = () -> TradeAgreement6.mmQuotationDocumentIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification22.mmObject();
		}

		@Override
		public Optional<DocumentIdentification22> getValue(TradeAgreement13 obj) {
			return obj.getQuotationDocumentIdentification();
		}

		@Override
		public void setValue(TradeAgreement13 obj, Optional<DocumentIdentification22> value) {
			obj.setQuotationDocumentIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "CtrctDocId")
	protected DocumentIdentification22 contractDocumentIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement13
	 * TradeAgreement13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrctDocId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractDocumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contract document referenced from this trade agreement."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement16#mmContractDocumentIdentification
	 * TradeAgreement16.mmContractDocumentIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement6#mmContractDocumentIdentification
	 * TradeAgreement6.mmContractDocumentIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeAgreement13, Optional<DocumentIdentification22>> mmContractDocumentIdentification = new MMMessageAttribute<TradeAgreement13, Optional<DocumentIdentification22>>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeAgreement13.mmObject();
			isDerived = false;
			xmlTag = "CtrctDocId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractDocumentIdentification";
			definition = "Contract document referenced from this trade agreement.";
			nextVersions_lazy = () -> Arrays.asList(TradeAgreement16.mmContractDocumentIdentification);
			previousVersion_lazy = () -> TradeAgreement6.mmContractDocumentIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification22.mmObject();
		}

		@Override
		public Optional<DocumentIdentification22> getValue(TradeAgreement13 obj) {
			return obj.getContractDocumentIdentification();
		}

		@Override
		public void setValue(TradeAgreement13 obj, Optional<DocumentIdentification22> value) {
			obj.setContractDocumentIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "BuyrOrdrIdDoc")
	protected DocumentIdentification22 buyerOrderIdentificationDocument;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement13
	 * TradeAgreement13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BuyrOrdrIdDoc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyerOrderIdentificationDocument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Buyer order document referenced from this trade agreement."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement16#mmBuyerOrderIdentificationDocument
	 * TradeAgreement16.mmBuyerOrderIdentificationDocument}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement6#mmBuyerOrderIdentificationDocument
	 * TradeAgreement6.mmBuyerOrderIdentificationDocument}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeAgreement13, Optional<DocumentIdentification22>> mmBuyerOrderIdentificationDocument = new MMMessageAttribute<TradeAgreement13, Optional<DocumentIdentification22>>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeAgreement13.mmObject();
			isDerived = false;
			xmlTag = "BuyrOrdrIdDoc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyerOrderIdentificationDocument";
			definition = "Buyer order document referenced from this trade agreement.";
			nextVersions_lazy = () -> Arrays.asList(TradeAgreement16.mmBuyerOrderIdentificationDocument);
			previousVersion_lazy = () -> TradeAgreement6.mmBuyerOrderIdentificationDocument;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification22.mmObject();
		}

		@Override
		public Optional<DocumentIdentification22> getValue(TradeAgreement13 obj) {
			return obj.getBuyerOrderIdentificationDocument();
		}

		@Override
		public void setValue(TradeAgreement13 obj, Optional<DocumentIdentification22> value) {
			obj.setBuyerOrderIdentificationDocument(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlRefDoc")
	protected List<DocumentGeneralInformation2> additionalReferenceDocument;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement13
	 * TradeAgreement13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlRefDoc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReferenceDocument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional document referenced from this trade agreement."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement16#mmAdditionalReferenceDocument
	 * TradeAgreement16.mmAdditionalReferenceDocument}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement6#mmAdditionalReferenceDocument
	 * TradeAgreement6.mmAdditionalReferenceDocument}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeAgreement13, List<DocumentGeneralInformation2>> mmAdditionalReferenceDocument = new MMMessageAssociationEnd<TradeAgreement13, List<DocumentGeneralInformation2>>() {
		{
			businessComponentTrace_lazy = () -> Document.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeAgreement13.mmObject();
			isDerived = false;
			xmlTag = "AddtlRefDoc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReferenceDocument";
			definition = "Additional document referenced from this trade agreement.";
			nextVersions_lazy = () -> Arrays.asList(TradeAgreement16.mmAdditionalReferenceDocument);
			previousVersion_lazy = () -> TradeAgreement6.mmAdditionalReferenceDocument;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DocumentGeneralInformation2.mmObject();
		}

		@Override
		public List<DocumentGeneralInformation2> getValue(TradeAgreement13 obj) {
			return obj.getAdditionalReferenceDocument();
		}

		@Override
		public void setValue(TradeAgreement13 obj, List<DocumentGeneralInformation2> value) {
			obj.setAdditionalReferenceDocument(value);
		}
	};
	@XmlElement(name = "Incotrms")
	protected Incoterms3 incoterms;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Incoterms3 Incoterms3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmIncoterms
	 * Transport.mmIncoterms}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement13
	 * TradeAgreement13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Incotrms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Incoterms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the applicable Incoterm and associated location."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement16#mmIncoterms
	 * TradeAgreement16.mmIncoterms}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TradeAgreement6#mmIncoterms
	 * TradeAgreement6.mmIncoterms}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeAgreement13, Optional<Incoterms3>> mmIncoterms = new MMMessageAssociationEnd<TradeAgreement13, Optional<Incoterms3>>() {
		{
			businessElementTrace_lazy = () -> Transport.mmIncoterms;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeAgreement13.mmObject();
			isDerived = false;
			xmlTag = "Incotrms";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Incoterms";
			definition = "Specifies the applicable Incoterm and associated location.";
			nextVersions_lazy = () -> Arrays.asList(TradeAgreement16.mmIncoterms);
			previousVersion_lazy = () -> TradeAgreement6.mmIncoterms;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Incoterms3.mmObject();
		}

		@Override
		public Optional<Incoterms3> getValue(TradeAgreement13 obj) {
			return obj.getIncoterms();
		}

		@Override
		public void setValue(TradeAgreement13 obj, Optional<Incoterms3> value) {
			obj.setIncoterms(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeAgreement13.mmBuyer, com.tools20022.repository.msg.TradeAgreement13.mmSeller,
						com.tools20022.repository.msg.TradeAgreement13.mmQuotationDocumentIdentification, com.tools20022.repository.msg.TradeAgreement13.mmContractDocumentIdentification,
						com.tools20022.repository.msg.TradeAgreement13.mmBuyerOrderIdentificationDocument, com.tools20022.repository.msg.TradeAgreement13.mmAdditionalReferenceDocument,
						com.tools20022.repository.msg.TradeAgreement13.mmIncoterms);
				trace_lazy = () -> Agreement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradeAgreement13";
				definition = "Contractual details related to the agreement between parties.";
				nextVersions_lazy = () -> Arrays.asList(TradeAgreement16.mmObject());
				previousVersion_lazy = () -> TradeAgreement6.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public TradeParty3 getBuyer() {
		return buyer;
	}

	public TradeAgreement13 setBuyer(TradeParty3 buyer) {
		this.buyer = Objects.requireNonNull(buyer);
		return this;
	}

	public TradeParty3 getSeller() {
		return seller;
	}

	public TradeAgreement13 setSeller(TradeParty3 seller) {
		this.seller = Objects.requireNonNull(seller);
		return this;
	}

	public Optional<DocumentIdentification22> getQuotationDocumentIdentification() {
		return quotationDocumentIdentification == null ? Optional.empty() : Optional.of(quotationDocumentIdentification);
	}

	public TradeAgreement13 setQuotationDocumentIdentification(DocumentIdentification22 quotationDocumentIdentification) {
		this.quotationDocumentIdentification = quotationDocumentIdentification;
		return this;
	}

	public Optional<DocumentIdentification22> getContractDocumentIdentification() {
		return contractDocumentIdentification == null ? Optional.empty() : Optional.of(contractDocumentIdentification);
	}

	public TradeAgreement13 setContractDocumentIdentification(DocumentIdentification22 contractDocumentIdentification) {
		this.contractDocumentIdentification = contractDocumentIdentification;
		return this;
	}

	public Optional<DocumentIdentification22> getBuyerOrderIdentificationDocument() {
		return buyerOrderIdentificationDocument == null ? Optional.empty() : Optional.of(buyerOrderIdentificationDocument);
	}

	public TradeAgreement13 setBuyerOrderIdentificationDocument(DocumentIdentification22 buyerOrderIdentificationDocument) {
		this.buyerOrderIdentificationDocument = buyerOrderIdentificationDocument;
		return this;
	}

	public List<DocumentGeneralInformation2> getAdditionalReferenceDocument() {
		return additionalReferenceDocument == null ? additionalReferenceDocument = new ArrayList<>() : additionalReferenceDocument;
	}

	public TradeAgreement13 setAdditionalReferenceDocument(List<DocumentGeneralInformation2> additionalReferenceDocument) {
		this.additionalReferenceDocument = Objects.requireNonNull(additionalReferenceDocument);
		return this;
	}

	public Optional<Incoterms3> getIncoterms() {
		return incoterms == null ? Optional.empty() : Optional.of(incoterms);
	}

	public TradeAgreement13 setIncoterms(Incoterms3 incoterms) {
		this.incoterms = incoterms;
		return this;
	}
}