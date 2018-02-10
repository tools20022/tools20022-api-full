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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.ShortLong1Code;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.Exact4AlphaNumericText;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.entity.Scheme;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Proprietary quantity format.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProprietaryQuantity3#mmShortLongPosition
 * ProprietaryQuantity3.mmShortLongPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProprietaryQuantity3#mmQuantity
 * ProprietaryQuantity3.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProprietaryQuantity3#mmQuantityType
 * ProprietaryQuantity3.mmQuantityType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryQuantity3#mmIssuer
 * ProprietaryQuantity3.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProprietaryQuantity3#mmSchemeName
 * ProprietaryQuantity3.mmSchemeName}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forProprietaryQuantity3
 * ConstraintCoexistenceQuantityRule.forProprietaryQuantity3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceIssuerSchemeNameRule#forProprietaryQuantity3
 * ConstraintCoexistenceIssuerSchemeNameRule.forProprietaryQuantity3}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ProprietaryQuantity3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Proprietary quantity format."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryQuantity7
 * ProprietaryQuantity7}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ProprietaryQuantity3", propOrder = {"shortLongPosition", "quantity", "quantityType", "issuer", "schemeName"})
public class ProprietaryQuantity3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ShrtLngPos")
	protected ShortLong1Code shortLongPosition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ShortLong1Code
	 * ShortLong1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryQuantity3
	 * ProprietaryQuantity3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShrtLngPos"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortLongPosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sign of the quantity of security."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryQuantity7#mmShortLongPosition
	 * ProprietaryQuantity7.mmShortLongPosition}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmShortLongPosition = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ProprietaryQuantity3.mmObject();
			isDerived = false;
			xmlTag = "ShrtLngPos";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortLongPosition";
			definition = "Sign of the quantity of security.";
			nextVersions_lazy = () -> Arrays.asList(ProprietaryQuantity7.mmShortLongPosition);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ShortLong1Code.mmObject();
		}
	};
	@XmlElement(name = "Qty", required = true)
	protected DecimalNumber quantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryQuantity3
	 * ProprietaryQuantity3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Qty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the proprietary quantity with a decimal number."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryQuantity7#mmQuantity
	 * ProprietaryQuantity7.mmQuantity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQuantity = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ProprietaryQuantity3.mmObject();
			isDerived = false;
			xmlTag = "Qty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quantity";
			definition = "Provides the proprietary quantity with a decimal number.";
			nextVersions_lazy = () -> Arrays.asList(ProprietaryQuantity7.mmQuantity);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	@XmlElement(name = "QtyTp", required = true)
	protected Exact4AlphaNumericText quantityType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact4AlphaNumericText
	 * Exact4AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryQuantity3
	 * ProprietaryQuantity3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtyTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the type of proprietary quantity reported."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryQuantity7#mmQuantityType
	 * ProprietaryQuantity7.mmQuantityType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQuantityType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ProprietaryQuantity3.mmObject();
			isDerived = false;
			xmlTag = "QtyTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityType";
			definition = "Identifies the type of proprietary quantity reported.";
			nextVersions_lazy = () -> Arrays.asList(ProprietaryQuantity7.mmQuantityType);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Exact4AlphaNumericText.mmObject();
		}
	};
	@XmlElement(name = "Issr", required = true)
	protected Max35Text issuer;
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
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmPartyRole
	 * GenericIdentification.mmPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryQuantity3
	 * ProprietaryQuantity3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Issr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93B::4!c/4c</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides information related to issuer in free format."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryQuantity7#mmIssuer
	 * ProprietaryQuantity7.mmIssuer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIssuer = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmPartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.ProprietaryQuantity3.mmObject();
			isDerived = false;
			xmlTag = "Issr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93B::4!c/4c"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuer";
			definition = "Provides information related to issuer in free format.";
			nextVersions_lazy = () -> Arrays.asList(ProprietaryQuantity7.mmIssuer);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "SchmeNm")
	protected Max35Text schemeName;
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
	 * {@linkplain com.tools20022.repository.entity.Scheme#mmNameShort
	 * Scheme.mmNameShort}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryQuantity3
	 * ProprietaryQuantity3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SchmeNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SchemeName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the identification scheme."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProprietaryQuantity7#mmSchemeName
	 * ProprietaryQuantity7.mmSchemeName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSchemeName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Scheme.mmNameShort;
			componentContext_lazy = () -> com.tools20022.repository.msg.ProprietaryQuantity3.mmObject();
			isDerived = false;
			xmlTag = "SchmeNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SchemeName";
			definition = "Name of the identification scheme.";
			nextVersions_lazy = () -> Arrays.asList(ProprietaryQuantity7.mmSchemeName);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ProprietaryQuantity3.mmShortLongPosition, com.tools20022.repository.msg.ProprietaryQuantity3.mmQuantity,
						com.tools20022.repository.msg.ProprietaryQuantity3.mmQuantityType, com.tools20022.repository.msg.ProprietaryQuantity3.mmIssuer, com.tools20022.repository.msg.ProprietaryQuantity3.mmSchemeName);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forProprietaryQuantity3,
						com.tools20022.repository.constraints.ConstraintCoexistenceIssuerSchemeNameRule.forProprietaryQuantity3);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "ProprietaryQuantity3";
				definition = "Proprietary quantity format.";
				nextVersions_lazy = () -> Arrays.asList(ProprietaryQuantity7.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ShortLong1Code> getShortLongPosition() {
		return shortLongPosition == null ? Optional.empty() : Optional.of(shortLongPosition);
	}

	public ProprietaryQuantity3 setShortLongPosition(ShortLong1Code shortLongPosition) {
		this.shortLongPosition = shortLongPosition;
		return this;
	}

	public DecimalNumber getQuantity() {
		return quantity;
	}

	public ProprietaryQuantity3 setQuantity(DecimalNumber quantity) {
		this.quantity = Objects.requireNonNull(quantity);
		return this;
	}

	public Exact4AlphaNumericText getQuantityType() {
		return quantityType;
	}

	public ProprietaryQuantity3 setQuantityType(Exact4AlphaNumericText quantityType) {
		this.quantityType = Objects.requireNonNull(quantityType);
		return this;
	}

	public Max35Text getIssuer() {
		return issuer;
	}

	public ProprietaryQuantity3 setIssuer(Max35Text issuer) {
		this.issuer = Objects.requireNonNull(issuer);
		return this;
	}

	public Optional<Max35Text> getSchemeName() {
		return schemeName == null ? Optional.empty() : Optional.of(schemeName);
	}

	public ProprietaryQuantity3 setSchemeName(Max35Text schemeName) {
		this.schemeName = schemeName;
		return this;
	}
}