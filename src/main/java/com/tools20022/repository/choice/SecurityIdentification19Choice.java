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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.UnderlyingIdentification1Code;
import com.tools20022.repository.datatype.ISINOct2015Identifier;
import com.tools20022.repository.datatype.Max52Text;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.entity.InterestCalculation;
import com.tools20022.repository.entity.Product;
import com.tools20022.repository.entity.SecuritiesIdentification;
import com.tools20022.repository.GeneratedRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between ISIN and an alternative format for the identification of a
 * financial instrument. ISIN is the preferred format.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification19Choice#mmISIN
 * SecurityIdentification19Choice.mmISIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification19Choice#mmAlternativeInstrumentIdentification
 * SecurityIdentification19Choice.mmAlternativeInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification19Choice#mmUniqueProductIdentifier
 * SecurityIdentification19Choice.mmUniqueProductIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification19Choice#mmBasketConstituents
 * SecurityIdentification19Choice.mmBasketConstituents}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification19Choice#mmIndex
 * SecurityIdentification19Choice.mmIndex}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification19Choice#mmIdentificationNotAvailable
 * SecurityIdentification19Choice.mmIdentificationNotAvailable}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
 * SecuritiesIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecurityIdentification19Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between ISIN and an alternative format for the identification of a financial instrument. ISIN is the preferred format."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification20Choice
 * SecurityIdentification20Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecurityIdentification19Choice", propOrder = {"iSIN", "alternativeInstrumentIdentification", "uniqueProductIdentifier", "basketConstituents", "index", "identificationNotAvailable"})
public class SecurityIdentification19Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ISIN", required = true)
	protected ISINOct2015Identifier iSIN;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ISINOct2015Identifier
	 * ISINOct2015Identifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmSecurityIdentification
	 * SecuritiesIdentification.mmSecurityIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification19Choice
	 * SecurityIdentification19Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ISIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "International Securities Identification Number (ISIN). A numbering system designed by the United Nation's International Organisation for Standardisation (ISO). The ISIN is composed of a 2-character prefix representing the country of issue, followed by the national security number (if one exists), and a check digit. Each country has a national numbering agency that assigns ISIN numbers for securities in that country."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification20Choice#mmISIN
	 * SecurityIdentification20Choice.mmISIN}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmISIN = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesIdentification.mmSecurityIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.SecurityIdentification19Choice.mmObject();
			isDerived = false;
			xmlTag = "ISIN";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISIN";
			definition = "International Securities Identification Number (ISIN). A numbering system designed by the United Nation's International Organisation for Standardisation (ISO). The ISIN is composed of a 2-character prefix representing the country of issue, followed by the national security number (if one exists), and a check digit. Each country has a national numbering agency that assigns ISIN numbers for securities in that country.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SecurityIdentification20Choice.mmISIN);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISINOct2015Identifier.mmObject();
		}
	};
	@XmlElement(name = "AltrntvInstrmId", required = true)
	protected Max52Text alternativeInstrumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max52Text
	 * Max52Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification19Choice
	 * SecurityIdentification19Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AltrntvInstrmId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlternativeInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Proprietary identification of a security assigned by an institution or organisation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAlternativeInstrumentIdentification = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> SecuritiesIdentification.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.SecurityIdentification19Choice.mmObject();
			isDerived = false;
			xmlTag = "AltrntvInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AlternativeInstrumentIdentification";
			definition = "Proprietary identification of a security assigned by an institution or organisation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max52Text.mmObject();
		}
	};
	@XmlElement(name = "UnqPdctIdr", required = true)
	protected Max52Text uniqueProductIdentifier;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max52Text
	 * Max52Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmProductIdentification
	 * Product.mmProductIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification19Choice
	 * SecurityIdentification19Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnqPdctIdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UniqueProductIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification through a Unique Product Identifier."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUniqueProductIdentifier = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Product.mmProductIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.SecurityIdentification19Choice.mmObject();
			isDerived = false;
			xmlTag = "UnqPdctIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UniqueProductIdentifier";
			definition = "Identification through a Unique Product Identifier.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max52Text.mmObject();
		}
	};
	@XmlElement(name = "BsktCnsttnts", required = true)
	protected List<com.tools20022.repository.choice.SecurityIdentification18Choice> basketConstituents;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification18Choice
	 * SecurityIdentification18Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedSecuritiesIdentification
	 * GenericIdentification.mmRelatedSecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification19Choice
	 * SecurityIdentification19Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BsktCnsttnts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BasketConstituents"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of constituents for basket of indexes."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBasketConstituents = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmRelatedSecuritiesIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.SecurityIdentification19Choice.mmObject();
			isDerived = false;
			xmlTag = "BsktCnsttnts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BasketConstituents";
			definition = "Identification of constituents for basket of indexes.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.SecurityIdentification18Choice.mmObject();
		}
	};
	@XmlElement(name = "Indx", required = true)
	protected SecurityIdentification20Choice index;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification20Choice
	 * SecurityIdentification20Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmRelatedIndex
	 * InterestCalculation.mmRelatedIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification19Choice
	 * SecurityIdentification19Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Indx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Index"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the index upon which the financial instrument is based."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification20Choice#mmName
	 * SecurityIdentification20Choice.mmName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIndex = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmRelatedIndex;
			componentContext_lazy = () -> com.tools20022.repository.choice.SecurityIdentification19Choice.mmObject();
			isDerived = false;
			xmlTag = "Indx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Index";
			definition = "Indicates the index upon which the financial instrument is based.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SecurityIdentification20Choice.mmName);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.SecurityIdentification20Choice.mmObject();
		}
	};
	@XmlElement(name = "IdNotAvlbl", required = true)
	protected UnderlyingIdentification1Code identificationNotAvailable;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingIdentification1Code
	 * UnderlyingIdentification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification19Choice
	 * SecurityIdentification19Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IdNotAvlbl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationNotAvailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that underlying identification is not available."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentificationNotAvailable = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.SecurityIdentification19Choice.mmObject();
			isDerived = false;
			xmlTag = "IdNotAvlbl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IdentificationNotAvailable";
			definition = "Indicates that underlying identification is not available.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UnderlyingIdentification1Code.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SecurityIdentification19Choice.mmISIN, com.tools20022.repository.choice.SecurityIdentification19Choice.mmAlternativeInstrumentIdentification,
						com.tools20022.repository.choice.SecurityIdentification19Choice.mmUniqueProductIdentifier, com.tools20022.repository.choice.SecurityIdentification19Choice.mmBasketConstituents,
						com.tools20022.repository.choice.SecurityIdentification19Choice.mmIndex, com.tools20022.repository.choice.SecurityIdentification19Choice.mmIdentificationNotAvailable);
				trace_lazy = () -> SecuritiesIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SecurityIdentification19Choice";
				definition = "Choice between ISIN and an alternative format for the identification of a financial instrument. ISIN is the preferred format.";
				nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SecurityIdentification20Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public ISINOct2015Identifier getISIN() {
		return iSIN;
	}

	public SecurityIdentification19Choice setISIN(ISINOct2015Identifier iSIN) {
		this.iSIN = Objects.requireNonNull(iSIN);
		return this;
	}

	public Max52Text getAlternativeInstrumentIdentification() {
		return alternativeInstrumentIdentification;
	}

	public SecurityIdentification19Choice setAlternativeInstrumentIdentification(Max52Text alternativeInstrumentIdentification) {
		this.alternativeInstrumentIdentification = Objects.requireNonNull(alternativeInstrumentIdentification);
		return this;
	}

	public Max52Text getUniqueProductIdentifier() {
		return uniqueProductIdentifier;
	}

	public SecurityIdentification19Choice setUniqueProductIdentifier(Max52Text uniqueProductIdentifier) {
		this.uniqueProductIdentifier = Objects.requireNonNull(uniqueProductIdentifier);
		return this;
	}

	public List<SecurityIdentification18Choice> getBasketConstituents() {
		return basketConstituents == null ? basketConstituents = new ArrayList<>() : basketConstituents;
	}

	public SecurityIdentification19Choice setBasketConstituents(List<com.tools20022.repository.choice.SecurityIdentification18Choice> basketConstituents) {
		this.basketConstituents = Objects.requireNonNull(basketConstituents);
		return this;
	}

	public SecurityIdentification20Choice getIndex() {
		return index;
	}

	public SecurityIdentification19Choice setIndex(com.tools20022.repository.choice.SecurityIdentification20Choice index) {
		this.index = Objects.requireNonNull(index);
		return this;
	}

	public UnderlyingIdentification1Code getIdentificationNotAvailable() {
		return identificationNotAvailable;
	}

	public SecurityIdentification19Choice setIdentificationNotAvailable(UnderlyingIdentification1Code identificationNotAvailable) {
		this.identificationNotAvailable = Objects.requireNonNull(identificationNotAvailable);
		return this;
	}
}