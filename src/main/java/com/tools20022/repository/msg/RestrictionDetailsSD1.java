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
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification36;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Restriction information details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RestrictionDetailsSD1#mmRestrictionType
 * RestrictionDetailsSD1.mmRestrictionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RestrictionDetailsSD1#mmFiscalDomicile
 * RestrictionDetailsSD1.mmFiscalDomicile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RestrictionDetailsSD1#mmIdentification
 * RestrictionDetailsSD1.mmIdentification}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RestrictionDetailsSD1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Restriction information details."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RestrictionDetailsSD1", propOrder = {"restrictionType", "fiscalDomicile", "identification"})
public class RestrictionDetailsSD1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RstrctnTp", required = true)
	protected GenericIdentification36 restrictionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification36
	 * GenericIdentification36}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RestrictionDetailsSD1
	 * RestrictionDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RstrctnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RestrictionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of restriction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RestrictionDetailsSD1, GenericIdentification36> mmRestrictionType = new MMMessageAssociationEnd<RestrictionDetailsSD1, GenericIdentification36>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RestrictionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "RstrctnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RestrictionType";
			definition = "Type of restriction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification36.mmObject();
		}

		@Override
		public GenericIdentification36 getValue(RestrictionDetailsSD1 obj) {
			return obj.getRestrictionType();
		}

		@Override
		public void setValue(RestrictionDetailsSD1 obj, GenericIdentification36 value) {
			obj.setRestrictionType(value);
		}
	};
	@XmlElement(name = "FsclDmcl", required = true)
	protected CountryCode fiscalDomicile;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RestrictionDetailsSD1
	 * RestrictionDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FsclDmcl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FiscalDomicile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Country in which the account owner has one's fiscal domicile."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RestrictionDetailsSD1, CountryCode> mmFiscalDomicile = new MMMessageAttribute<RestrictionDetailsSD1, CountryCode>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RestrictionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "FsclDmcl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FiscalDomicile";
			definition = "Country in which the account owner has one's fiscal domicile.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public CountryCode getValue(RestrictionDetailsSD1 obj) {
			return obj.getFiscalDomicile();
		}

		@Override
		public void setValue(RestrictionDetailsSD1 obj, CountryCode value) {
			obj.setFiscalDomicile(value);
		}
	};
	@XmlElement(name = "Id", required = true)
	protected Max35Text identification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RestrictionDetailsSD1
	 * RestrictionDetailsSD1}</li>
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
	 * definition} = "Reference to the applicable restriction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RestrictionDetailsSD1, Max35Text> mmIdentification = new MMMessageAttribute<RestrictionDetailsSD1, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RestrictionDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Reference to the applicable restriction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(RestrictionDetailsSD1 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(RestrictionDetailsSD1 obj, Max35Text value) {
			obj.setIdentification(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RestrictionDetailsSD1.mmRestrictionType, com.tools20022.repository.msg.RestrictionDetailsSD1.mmFiscalDomicile,
						com.tools20022.repository.msg.RestrictionDetailsSD1.mmIdentification);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "RestrictionDetailsSD1";
				definition = "Restriction information details.";
			}
		});
		return mmObject_lazy.get();
	}

	public GenericIdentification36 getRestrictionType() {
		return restrictionType;
	}

	public RestrictionDetailsSD1 setRestrictionType(GenericIdentification36 restrictionType) {
		this.restrictionType = Objects.requireNonNull(restrictionType);
		return this;
	}

	public CountryCode getFiscalDomicile() {
		return fiscalDomicile;
	}

	public RestrictionDetailsSD1 setFiscalDomicile(CountryCode fiscalDomicile) {
		this.fiscalDomicile = Objects.requireNonNull(fiscalDomicile);
		return this;
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public RestrictionDetailsSD1 setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}
}