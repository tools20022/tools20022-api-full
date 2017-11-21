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
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.NonFinancialInstitution;
import com.tools20022.repository.entity.OrganisationIdentification;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Unique and unambiguous identification of a non-financial institution.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonFinancialInstitutionIdentification1#mmBEI
 * NonFinancialInstitutionIdentification1.mmBEI}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonFinancialInstitutionIdentification1#mmEANGLN
 * NonFinancialInstitutionIdentification1.mmEANGLN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonFinancialInstitutionIdentification1#mmCHIPSUniversalIdentification
 * NonFinancialInstitutionIdentification1.mmCHIPSUniversalIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonFinancialInstitutionIdentification1#mmDUNS
 * NonFinancialInstitutionIdentification1.mmDUNS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonFinancialInstitutionIdentification1#mmBankPartyIdentification
 * NonFinancialInstitutionIdentification1.mmBankPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonFinancialInstitutionIdentification1#mmTaxIdentificationNumber
 * NonFinancialInstitutionIdentification1.mmTaxIdentificationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonFinancialInstitutionIdentification1#mmProprietaryIdentification
 * NonFinancialInstitutionIdentification1.mmProprietaryIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.NonFinancialInstitution
 * NonFinancialInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NonFinancialInstitutionIdentification1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Unique and unambiguous identification of a non-financial institution."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "NonFinancialInstitutionIdentification1", propOrder = {"BEI", "EANGLN", "CHIPSUniversalIdentification", "DUNS", "bankPartyIdentification", "taxIdentificationNumber", "proprietaryIdentification"})
public class NonFinancialInstitutionIdentification1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected BEIIdentifier bEI;
	/**
	 * Code allocated to a non-financial institution by the ISO 9362
	 * Registration Authority as described in ISO 9362
	 * "Banking - Banking telecommunication messages - Business identifier code (BIC)"
	 * .
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BEIIdentifier
	 * BEIIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmBICNonFI
	 * OrganisationIdentification.mmBICNonFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NonFinancialInstitutionIdentification1
	 * NonFinancialInstitutionIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BEI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BEI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code allocated to a non-financial institution by the ISO 9362 Registration Authority as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\"."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBEI = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmBICNonFI;
			componentContext_lazy = () -> NonFinancialInstitutionIdentification1.mmObject();
			isDerived = false;
			xmlTag = "BEI";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BEI";
			definition = "Code allocated to a non-financial institution by the ISO 9362 Registration Authority as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BEIIdentifier.mmObject();
		}
	};
	protected EANGLNIdentifier eANGLN;
	/**
	 * Global Location Number. A non-significant reference number used to
	 * identify legal entities, functional entities or physical entities
	 * according to the European Association for Numbering (EAN) numbering
	 * scheme rules. The number is used to retrieve detailed information linked
	 * to it.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.EANGLNIdentifier
	 * EANGLNIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmEANGLN
	 * OrganisationIdentification.mmEANGLN}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NonFinancialInstitutionIdentification1
	 * NonFinancialInstitutionIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EANGLN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EANGLN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Global Location Number.  A non-significant reference number used to identify legal entities, functional entities or physical entities according to the European Association for Numbering (EAN) numbering scheme rules. The number is used to retrieve detailed information linked to it."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEANGLN = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmEANGLN;
			componentContext_lazy = () -> NonFinancialInstitutionIdentification1.mmObject();
			isDerived = false;
			xmlTag = "EANGLN";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EANGLN";
			definition = "Global Location Number.  A non-significant reference number used to identify legal entities, functional entities or physical entities according to the European Association for Numbering (EAN) numbering scheme rules. The number is used to retrieve detailed information linked to it.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> EANGLNIdentifier.mmObject();
		}
	};
	protected CHIPSUniversalIdentifier cHIPSUniversalIdentification;
	/**
	 * (United States) Clearing House Interbank Payments System (CHIPS)
	 * Universal Identification (UID) - identifies entities that own accounts at
	 * CHIPS participating financial institutions, through which CHIPS payments
	 * are effected. The CHIPS UID is assigned by the New York Clearing House.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CHIPSUniversalIdentifier
	 * CHIPSUniversalIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmCHIPSUniversalIdentifier
	 * OrganisationIdentification.mmCHIPSUniversalIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NonFinancialInstitutionIdentification1
	 * NonFinancialInstitutionIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "USCHU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CHIPSUniversalIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "(United States) Clearing House Interbank Payments System (CHIPS) Universal Identification (UID) - identifies entities that own accounts at CHIPS participating financial institutions, through which CHIPS payments are effected. The CHIPS UID is assigned by the New York Clearing House."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCHIPSUniversalIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmCHIPSUniversalIdentifier;
			componentContext_lazy = () -> NonFinancialInstitutionIdentification1.mmObject();
			isDerived = false;
			xmlTag = "USCHU";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CHIPSUniversalIdentification";
			definition = "(United States) Clearing House Interbank Payments System (CHIPS) Universal Identification (UID) - identifies entities that own accounts at CHIPS participating financial institutions, through which CHIPS payments are effected. The CHIPS UID is assigned by the New York Clearing House.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CHIPSUniversalIdentifier.mmObject();
		}
	};
	protected DunsIdentifier dUNS;
	/**
	 * Data Universal Numbering System. A unique identification number provided
	 * by Dun &amp; Bradstreet to identify an organization.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DunsIdentifier
	 * DunsIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmDUNS
	 * OrganisationIdentification.mmDUNS}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NonFinancialInstitutionIdentification1
	 * NonFinancialInstitutionIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DUNS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DUNS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Data Universal Numbering System. A unique identification number provided by Dun &amp; Bradstreet to identify an organization."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDUNS = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmDUNS;
			componentContext_lazy = () -> NonFinancialInstitutionIdentification1.mmObject();
			isDerived = false;
			xmlTag = "DUNS";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DUNS";
			definition = "Data Universal Numbering System. A unique identification number provided by Dun & Bradstreet to identify an organization.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DunsIdentifier.mmObject();
		}
	};
	protected Max35Text bankPartyIdentification;
	/**
	 * Unique and unambiguous assignment made by a specific bank to identify a
	 * relationship as defined between the bank and its client.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmBankPartyIdentification
	 * OrganisationIdentification.mmBankPartyIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NonFinancialInstitutionIdentification1
	 * NonFinancialInstitutionIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BkPtyId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankPartyIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous assignment made by a specific bank to identify a relationship as defined between the bank and its client."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBankPartyIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmBankPartyIdentification;
			componentContext_lazy = () -> NonFinancialInstitutionIdentification1.mmObject();
			isDerived = false;
			xmlTag = "BkPtyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankPartyIdentification";
			definition = "Unique and unambiguous assignment made by a specific bank to identify a relationship as defined between the bank and its client.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text taxIdentificationNumber;
	/**
	 * Number assigned by a tax authority to an entity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmTaxIdentificationNumber
	 * PartyIdentificationInformation.mmTaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NonFinancialInstitutionIdentification1
	 * NonFinancialInstitutionIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxIdNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxIdentificationNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number assigned by a tax authority to an entity."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxIdentificationNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmTaxIdentificationNumber;
			componentContext_lazy = () -> NonFinancialInstitutionIdentification1.mmObject();
			isDerived = false;
			xmlTag = "TaxIdNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxIdentificationNumber";
			definition = "Number assigned by a tax authority to an entity.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected GenericIdentification3 proprietaryIdentification;
	/**
	 * Unique and unambiguous identifier for an organisation that is allocated
	 * by an institution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.GenericIdentification3
	 * GenericIdentification3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
	 * PartyIdentificationInformation.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NonFinancialInstitutionIdentification1
	 * NonFinancialInstitutionIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtryId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProprietaryIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for an organisation that is allocated by an institution."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProprietaryIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> NonFinancialInstitutionIdentification1.mmObject();
			isDerived = false;
			xmlTag = "PrtryId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryIdentification";
			definition = "Unique and unambiguous identifier for an organisation that is allocated by an institution.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification3.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(NonFinancialInstitutionIdentification1.mmBEI, NonFinancialInstitutionIdentification1.mmEANGLN, NonFinancialInstitutionIdentification1.mmCHIPSUniversalIdentification,
						NonFinancialInstitutionIdentification1.mmDUNS, NonFinancialInstitutionIdentification1.mmBankPartyIdentification, NonFinancialInstitutionIdentification1.mmTaxIdentificationNumber,
						NonFinancialInstitutionIdentification1.mmProprietaryIdentification);
				trace_lazy = () -> NonFinancialInstitution.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "NonFinancialInstitutionIdentification1";
				definition = "Unique and unambiguous identification of a non-financial institution.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "BEI")
	public BEIIdentifier getBEI() {
		return bEI;
	}

	public void setBEI(BEIIdentifier bEI) {
		this.bEI = bEI;
	}

	@XmlElement(name = "EANGLN")
	public EANGLNIdentifier getEANGLN() {
		return eANGLN;
	}

	public void setEANGLN(EANGLNIdentifier eANGLN) {
		this.eANGLN = eANGLN;
	}

	@XmlElement(name = "USCHU")
	public CHIPSUniversalIdentifier getCHIPSUniversalIdentification() {
		return cHIPSUniversalIdentification;
	}

	public void setCHIPSUniversalIdentification(CHIPSUniversalIdentifier cHIPSUniversalIdentification) {
		this.cHIPSUniversalIdentification = cHIPSUniversalIdentification;
	}

	@XmlElement(name = "DUNS")
	public DunsIdentifier getDUNS() {
		return dUNS;
	}

	public void setDUNS(DunsIdentifier dUNS) {
		this.dUNS = dUNS;
	}

	@XmlElement(name = "BkPtyId")
	public Max35Text getBankPartyIdentification() {
		return bankPartyIdentification;
	}

	public void setBankPartyIdentification(Max35Text bankPartyIdentification) {
		this.bankPartyIdentification = bankPartyIdentification;
	}

	@XmlElement(name = "TaxIdNb")
	public Max35Text getTaxIdentificationNumber() {
		return taxIdentificationNumber;
	}

	public void setTaxIdentificationNumber(Max35Text taxIdentificationNumber) {
		this.taxIdentificationNumber = taxIdentificationNumber;
	}

	@XmlElement(name = "PrtryId")
	public GenericIdentification3 getProprietaryIdentification() {
		return proprietaryIdentification;
	}

	public void setProprietaryIdentification(com.tools20022.repository.msg.GenericIdentification3 proprietaryIdentification) {
		this.proprietaryIdentification = proprietaryIdentification;
	}
}