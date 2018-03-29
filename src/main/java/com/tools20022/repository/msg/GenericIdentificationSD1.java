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
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identification information expressed as a country of fiscal domicile and a
 * reference.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentificationSD1#mmFiscalDomicile
 * GenericIdentificationSD1.mmFiscalDomicile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentificationSD1#mmAccountServicerIdentification
 * GenericIdentificationSD1.mmAccountServicerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentificationSD1#mmAccountOwnerIdentification
 * GenericIdentificationSD1.mmAccountOwnerIdentification}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountOwnerOrServicerIdentificationRule#forGenericIdentificationSD1
 * ConstraintAccountOwnerOrServicerIdentificationRule.
 * forGenericIdentificationSD1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "GenericIdentificationSD1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identification information expressed as a country of fiscal domicile and a reference."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "GenericIdentificationSD1", propOrder = {"fiscalDomicile", "accountServicerIdentification", "accountOwnerIdentification"})
public class GenericIdentificationSD1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	 * {@linkplain com.tools20022.repository.msg.GenericIdentificationSD1
	 * GenericIdentificationSD1}</li>
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
	public static final MMMessageAttribute<GenericIdentificationSD1, CountryCode> mmFiscalDomicile = new MMMessageAttribute<GenericIdentificationSD1, CountryCode>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.GenericIdentificationSD1.mmObject();
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
		public CountryCode getValue(GenericIdentificationSD1 obj) {
			return obj.getFiscalDomicile();
		}

		@Override
		public void setValue(GenericIdentificationSD1 obj, CountryCode value) {
			obj.setFiscalDomicile(value);
		}
	};
	@XmlElement(name = "AcctSvcrId")
	protected Max35Text accountServicerIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentificationSD1
	 * GenericIdentificationSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSvcrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the document assigned by the account servicer."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<GenericIdentificationSD1, Optional<Max35Text>> mmAccountServicerIdentification = new MMMessageAttribute<GenericIdentificationSD1, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.GenericIdentificationSD1.mmObject();
			isDerived = false;
			xmlTag = "AcctSvcrId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerIdentification";
			definition = "Identification of the document assigned by the account servicer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(GenericIdentificationSD1 obj) {
			return obj.getAccountServicerIdentification();
		}

		@Override
		public void setValue(GenericIdentificationSD1 obj, Optional<Max35Text> value) {
			obj.setAccountServicerIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctOwnrId")
	protected Max35Text accountOwnerIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentificationSD1
	 * GenericIdentificationSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwnerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the document assigned by the account owner."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<GenericIdentificationSD1, Optional<Max35Text>> mmAccountOwnerIdentification = new MMMessageAttribute<GenericIdentificationSD1, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.GenericIdentificationSD1.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnrId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwnerIdentification";
			definition = "Identification of the document assigned by the account owner.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(GenericIdentificationSD1 obj) {
			return obj.getAccountOwnerIdentification();
		}

		@Override
		public void setValue(GenericIdentificationSD1 obj, Optional<Max35Text> value) {
			obj.setAccountOwnerIdentification(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GenericIdentificationSD1.mmFiscalDomicile, com.tools20022.repository.msg.GenericIdentificationSD1.mmAccountServicerIdentification,
						com.tools20022.repository.msg.GenericIdentificationSD1.mmAccountOwnerIdentification);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAccountOwnerOrServicerIdentificationRule.forGenericIdentificationSD1);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "GenericIdentificationSD1";
				definition = "Identification information expressed as a country of fiscal domicile and a reference.";
			}
		});
		return mmObject_lazy.get();
	}

	public CountryCode getFiscalDomicile() {
		return fiscalDomicile;
	}

	public GenericIdentificationSD1 setFiscalDomicile(CountryCode fiscalDomicile) {
		this.fiscalDomicile = Objects.requireNonNull(fiscalDomicile);
		return this;
	}

	public Optional<Max35Text> getAccountServicerIdentification() {
		return accountServicerIdentification == null ? Optional.empty() : Optional.of(accountServicerIdentification);
	}

	public GenericIdentificationSD1 setAccountServicerIdentification(Max35Text accountServicerIdentification) {
		this.accountServicerIdentification = accountServicerIdentification;
		return this;
	}

	public Optional<Max35Text> getAccountOwnerIdentification() {
		return accountOwnerIdentification == null ? Optional.empty() : Optional.of(accountOwnerIdentification);
	}

	public GenericIdentificationSD1 setAccountOwnerIdentification(Max35Text accountOwnerIdentification) {
		this.accountOwnerIdentification = accountOwnerIdentification;
		return this;
	}
}