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
import com.tools20022.repository.codeset.ExternalDocumentType1Code;
import com.tools20022.repository.codeset.LanguageCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of characteristics shared by all individual transactions included in the
 * message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader69#mmIdentification
 * GroupHeader69.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader69#mmIssuedDate
 * GroupHeader69.mmIssuedDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader69#mmReportCategory
 * GroupHeader69.mmReportCategory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GroupHeader69#mmTaxReportPurpose
 * GroupHeader69.mmTaxReportPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GroupHeader69#mmOriginalIdentification
 * GroupHeader69.mmOriginalIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GroupHeader69#mmSellerTaxRepresentative
 * GroupHeader69.mmSellerTaxRepresentative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GroupHeader69#mmBuyerTaxRepresentative
 * GroupHeader69.mmBuyerTaxRepresentative}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GroupHeader69#mmLanguageCode
 * GroupHeader69.mmLanguageCode}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
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
 * "GroupHeader69"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of characteristics shared by all individual transactions included in the message."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.GroupHeader12
 * GroupHeader12}</li>
 * </ul>
 */
public class GroupHeader69 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text identification;
	/**
	 * Report identification, for example invoice number or report number from
	 * point of sales system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader69 GroupHeader69}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Report identification, for example invoice number or report number from point of sales system."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader12#mmMessageIdentification
	 * GroupHeader12.mmMessageIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> GroupHeader69.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Report identification, for example invoice number or report number from point of sales system.";
			previousVersion_lazy = () -> GroupHeader12.mmMessageIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ISODate issuedDate;
	/**
	 * Date at which the status report was created.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader69 GroupHeader69}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssdDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuedDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date at which the status report was created."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader12#mmCreationDateTime
	 * GroupHeader12.mmCreationDateTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIssuedDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> GroupHeader69.mmObject();
			isDerived = false;
			xmlTag = "IssdDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuedDate";
			definition = "Date at which the status report was created.";
			previousVersion_lazy = () -> GroupHeader12.mmCreationDateTime;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ExternalDocumentType1Code reportCategory;
	/**
	 * Specifies if the report is based on debit invoice, credit invoice, card
	 * transaction or cash transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalDocumentType1Code
	 * ExternalDocumentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader69 GroupHeader69}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptCtgy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportCategory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the report is based on debit invoice, credit invoice, card transaction or cash transaction. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReportCategory = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> GroupHeader69.mmObject();
			isDerived = false;
			xmlTag = "RptCtgy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportCategory";
			definition = "Specifies if the report is based on debit invoice, credit invoice, card transaction or cash transaction. ";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalDocumentType1Code.mmObject();
		}
	};
	protected ExternalDocumentType1Code taxReportPurpose;
	/**
	 * Specifies if the TaxReport is new, correction or remove.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalDocumentType1Code
	 * ExternalDocumentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader69 GroupHeader69}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxRptPurp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxReportPurpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies if the TaxReport is new, correction or remove."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxReportPurpose = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> GroupHeader69.mmObject();
			isDerived = false;
			xmlTag = "TaxRptPurp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxReportPurpose";
			definition = "Specifies if the TaxReport is new, correction or remove.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalDocumentType1Code.mmObject();
		}
	};
	protected Max35Text originalIdentification;
	/**
	 * Original tax report identification, used for example original invoice
	 * number with credit notes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader69 GroupHeader69}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Original tax report identification, used for example original invoice number with credit notes."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> GroupHeader69.mmObject();
			isDerived = false;
			xmlTag = "OrgnlId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalIdentification";
			definition = "Original tax report identification, used for example original invoice number with credit notes.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected PartyIdentification116 sellerTaxRepresentative;
	/**
	 * Details of tax representative. The corporate (seller) is allowed to use a
	 * tax representative for value added tax responsibilities in case the
	 * seller is not registered in a specific value added tax registry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification116
	 * PartyIdentification116}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader69 GroupHeader69}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SellrTaxRprtv"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellerTaxRepresentative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details of tax representative. The corporate (seller) is allowed to use a tax representative for value added tax responsibilities in case the seller is not registered in a specific value added tax registry."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSellerTaxRepresentative = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> GroupHeader69.mmObject();
			isDerived = false;
			xmlTag = "SellrTaxRprtv";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellerTaxRepresentative";
			definition = "Details of tax representative. The corporate (seller) is allowed to use a tax representative for value added tax responsibilities in case the seller is not registered in a specific value added tax registry.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification116.mmObject();
		}
	};
	protected PartyIdentification116 buyerTaxRepresentative;
	/**
	 * Details of tax representative. The corporate (buyer) is allowed to use a
	 * tax representative for value added tax responsibilities in case the buyer
	 * is not registered in a specific value added tax registry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification116
	 * PartyIdentification116}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader69 GroupHeader69}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BuyrTaxRprtv"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyerTaxRepresentative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details of tax representative. The corporate (buyer) is allowed to use a tax representative for value added tax responsibilities in  case the buyer is not registered in a specific value added tax registry."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBuyerTaxRepresentative = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> GroupHeader69.mmObject();
			isDerived = false;
			xmlTag = "BuyrTaxRprtv";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyerTaxRepresentative";
			definition = "Details of tax representative. The corporate (buyer) is allowed to use a tax representative for value added tax responsibilities in  case the buyer is not registered in a specific value added tax registry.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification116.mmObject();
		}
	};
	protected LanguageCode languageCode;
	/**
	 * Specifies the language used in the message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.LanguageCode
	 * LanguageCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GroupHeader69 GroupHeader69}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LangCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LanguageCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the language used in the message."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLanguageCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> GroupHeader69.mmObject();
			isDerived = false;
			xmlTag = "LangCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LanguageCode";
			definition = "Specifies the language used in the message.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> LanguageCode.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(GroupHeader69.mmIdentification, GroupHeader69.mmIssuedDate, GroupHeader69.mmReportCategory, GroupHeader69.mmTaxReportPurpose, GroupHeader69.mmOriginalIdentification,
						GroupHeader69.mmSellerTaxRepresentative, GroupHeader69.mmBuyerTaxRepresentative, GroupHeader69.mmLanguageCode);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "GroupHeader69";
				definition = "Set of characteristics shared by all individual transactions included in the message.";
				previousVersion_lazy = () -> GroupHeader12.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public void setIdentification(Max35Text identification) {
		this.identification = identification;
	}

	public ISODate getIssuedDate() {
		return issuedDate;
	}

	public void setIssuedDate(ISODate issuedDate) {
		this.issuedDate = issuedDate;
	}

	public ExternalDocumentType1Code getReportCategory() {
		return reportCategory;
	}

	public void setReportCategory(ExternalDocumentType1Code reportCategory) {
		this.reportCategory = reportCategory;
	}

	public ExternalDocumentType1Code getTaxReportPurpose() {
		return taxReportPurpose;
	}

	public void setTaxReportPurpose(ExternalDocumentType1Code taxReportPurpose) {
		this.taxReportPurpose = taxReportPurpose;
	}

	public Max35Text getOriginalIdentification() {
		return originalIdentification;
	}

	public void setOriginalIdentification(Max35Text originalIdentification) {
		this.originalIdentification = originalIdentification;
	}

	public PartyIdentification116 getSellerTaxRepresentative() {
		return sellerTaxRepresentative;
	}

	public void setSellerTaxRepresentative(com.tools20022.repository.msg.PartyIdentification116 sellerTaxRepresentative) {
		this.sellerTaxRepresentative = sellerTaxRepresentative;
	}

	public PartyIdentification116 getBuyerTaxRepresentative() {
		return buyerTaxRepresentative;
	}

	public void setBuyerTaxRepresentative(com.tools20022.repository.msg.PartyIdentification116 buyerTaxRepresentative) {
		this.buyerTaxRepresentative = buyerTaxRepresentative;
	}

	public LanguageCode getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(LanguageCode languageCode) {
		this.languageCode = languageCode;
	}
}