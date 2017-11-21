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
import com.tools20022.repository.datatype.Max2000Text;
import com.tools20022.repository.datatype.positiveInteger;
import com.tools20022.repository.entity.Document;
import com.tools20022.repository.entity.Guarantee;
import com.tools20022.repository.entity.GuarantorRole;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Indicates the details of a guarantee.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.GuaranteeDetails1#mmIssuer
 * GuaranteeDetails1.mmIssuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GuaranteeDetails1#mmPosition
 * GuaranteeDetails1.mmPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GuaranteeDetails1#mmDescription
 * GuaranteeDetails1.mmDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GuaranteeDetails1#mmGuaranteedAmount
 * GuaranteeDetails1.mmGuaranteedAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GuaranteeDetails1#mmExcess
 * GuaranteeDetails1.mmExcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GuaranteeDetails1#mmCoveredPercentage
 * GuaranteeDetails1.mmCoveredPercentage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GuaranteeDetails1#mmAssociatedDocument
 * GuaranteeDetails1.mmAssociatedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GuaranteeDetails1#mmAdditionalInformation
 * GuaranteeDetails1.mmAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Guarantee Guarantee}</li>
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
 * "GuaranteeDetails1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Indicates the details of a guarantee."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "GuaranteeDetails1", propOrder = {"issuer", "position", "description", "guaranteedAmount", "excess", "coveredPercentage", "associatedDocument", "additionalInformation"})
public class GuaranteeDetails1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected QualifiedPartyIdentification1 issuer;
	/**
	 * Party issuing the guarantee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.QualifiedPartyIdentification1
	 * QualifiedPartyIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GuaranteeDetails1
	 * GuaranteeDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Issr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party issuing the guarantee."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIssuer = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> GuaranteeDetails1.mmObject();
			isDerived = false;
			xmlTag = "Issr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuer";
			definition = "Party issuing the guarantee.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = false;
			type_lazy = () -> com.tools20022.repository.msg.QualifiedPartyIdentification1.mmObject();
		}
	};
	protected positiveInteger position;
	/**
	 * Rank of the guarantee provider. A value of 1 means highest rank.
	 * Providers may have the same position.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.positiveInteger
	 * positiveInteger}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GuarantorRole#mmPosition
	 * GuarantorRole.mmPosition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GuaranteeDetails1
	 * GuaranteeDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pos"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Position"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rank of the guarantee provider. A value of 1 means highest rank. Providers may have the same position."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPosition = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> GuarantorRole.mmPosition;
			componentContext_lazy = () -> GuaranteeDetails1.mmObject();
			isDerived = false;
			xmlTag = "Pos";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Position";
			definition = "Rank of the guarantee provider. A value of 1 means highest rank. Providers may have the same position.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> positiveInteger.mmObject();
		}
	};
	protected Max2000Text description;
	/**
	 * Textual description of guarantee details.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max2000Text
	 * Max2000Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GuaranteeDetails1
	 * GuaranteeDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Desc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Description"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Textual description of guarantee details."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDescription = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> GuaranteeDetails1.mmObject();
			isDerived = false;
			xmlTag = "Desc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Description";
			definition = "Textual description of guarantee details.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max2000Text.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.AmountAndPeriod1> guaranteedAmount;
	/**
	 * Amount by time periods, maximum value applies at any given date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndPeriod1
	 * AmountAndPeriod1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Guarantee#mmCoveredAmount
	 * Guarantee.mmCoveredAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GuaranteeDetails1
	 * GuaranteeDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrntedAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GuaranteedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount by time periods, maximum value applies at any given date."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmGuaranteedAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Guarantee.mmCoveredAmount;
			componentContext_lazy = () -> GuaranteeDetails1.mmObject();
			isDerived = false;
			xmlTag = "GrntedAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GuaranteedAmount";
			definition = "Amount by time periods, maximum value applies at any given date.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndPeriod1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.AmountAndPeriod1> excess;
	/**
	 * Amount not covered by the guarantee. Maximum value applies at any given
	 * date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndPeriod1
	 * AmountAndPeriod1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Guarantee#mmExcessAmount
	 * Guarantee.mmExcessAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GuaranteeDetails1
	 * GuaranteeDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Xcss"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Excess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount not covered by the guarantee. Maximum value applies at any given date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmExcess = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Guarantee.mmExcessAmount;
			componentContext_lazy = () -> GuaranteeDetails1.mmObject();
			isDerived = false;
			xmlTag = "Xcss";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Excess";
			definition = "Amount not covered by the guarantee. Maximum value applies at any given date.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndPeriod1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.PercentageAndPeriod1> coveredPercentage;
	/**
	 * Covered percentage, the maximum value applies at any given date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PercentageAndPeriod1
	 * PercentageAndPeriod1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Guarantee#mmCoveredPercentage
	 * Guarantee.mmCoveredPercentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GuaranteeDetails1
	 * GuaranteeDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CvrdPctg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoveredPercentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Covered percentage, the maximum value applies at any given date."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCoveredPercentage = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Guarantee.mmCoveredPercentage;
			componentContext_lazy = () -> GuaranteeDetails1.mmObject();
			isDerived = false;
			xmlTag = "CvrdPctg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoveredPercentage";
			definition = "Covered percentage, the maximum value applies at any given date.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PercentageAndPeriod1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.QualifiedDocumentInformation1> associatedDocument;
	/**
	 * Associated free form document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.QualifiedDocumentInformation1
	 * QualifiedDocumentInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GuaranteeDetails1
	 * GuaranteeDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AssoctdDoc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssociatedDocument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Associated free form document."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAssociatedDocument = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Document.mmObject();
			componentContext_lazy = () -> GuaranteeDetails1.mmObject();
			isDerived = false;
			xmlTag = "AssoctdDoc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssociatedDocument";
			definition = "Associated free form document.";
			minOccurs = 0;
			isComposite = false;
			type_lazy = () -> com.tools20022.repository.msg.QualifiedDocumentInformation1.mmObject();
		}
	};
	protected List<Max2000Text> additionalInformation;
	/**
	 * Additional information related to the demand.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max2000Text
	 * Max2000Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GuaranteeDetails1
	 * GuaranteeDetails1}</li>
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
	 * definition} = "Additional information related to the demand."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> GuaranteeDetails1.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information related to the demand.";
			maxOccurs = 5;
			minOccurs = 0;
			simpleType_lazy = () -> Max2000Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(GuaranteeDetails1.mmIssuer, GuaranteeDetails1.mmPosition, GuaranteeDetails1.mmDescription, GuaranteeDetails1.mmGuaranteedAmount, GuaranteeDetails1.mmExcess,
						GuaranteeDetails1.mmCoveredPercentage, GuaranteeDetails1.mmAssociatedDocument, GuaranteeDetails1.mmAdditionalInformation);
				trace_lazy = () -> Guarantee.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "GuaranteeDetails1";
				definition = "Indicates the details of a guarantee.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Issr")
	public QualifiedPartyIdentification1 getIssuer() {
		return issuer;
	}

	public void setIssuer(com.tools20022.repository.msg.QualifiedPartyIdentification1 issuer) {
		this.issuer = issuer;
	}

	@XmlElement(name = "Pos")
	public positiveInteger getPosition() {
		return position;
	}

	public void setPosition(positiveInteger position) {
		this.position = position;
	}

	@XmlElement(name = "Desc")
	public Max2000Text getDescription() {
		return description;
	}

	public void setDescription(Max2000Text description) {
		this.description = description;
	}

	@XmlElement(name = "GrntedAmt")
	public List<AmountAndPeriod1> getGuaranteedAmount() {
		return guaranteedAmount;
	}

	public void setGuaranteedAmount(List<com.tools20022.repository.msg.AmountAndPeriod1> guaranteedAmount) {
		this.guaranteedAmount = guaranteedAmount;
	}

	@XmlElement(name = "Xcss")
	public List<AmountAndPeriod1> getExcess() {
		return excess;
	}

	public void setExcess(List<com.tools20022.repository.msg.AmountAndPeriod1> excess) {
		this.excess = excess;
	}

	@XmlElement(name = "CvrdPctg")
	public List<PercentageAndPeriod1> getCoveredPercentage() {
		return coveredPercentage;
	}

	public void setCoveredPercentage(List<com.tools20022.repository.msg.PercentageAndPeriod1> coveredPercentage) {
		this.coveredPercentage = coveredPercentage;
	}

	@XmlElement(name = "AssoctdDoc")
	public List<QualifiedDocumentInformation1> getAssociatedDocument() {
		return associatedDocument;
	}

	public void setAssociatedDocument(List<com.tools20022.repository.msg.QualifiedDocumentInformation1> associatedDocument) {
		this.associatedDocument = associatedDocument;
	}

	@XmlElement(name = "AddtlInf")
	public List<Max2000Text> getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(List<Max2000Text> additionalInformation) {
		this.additionalInformation = additionalInformation;
	}
}