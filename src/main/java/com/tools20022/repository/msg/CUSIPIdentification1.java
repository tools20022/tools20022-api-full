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

import com.tools20022.metamodel.ext.DTCCSynonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.CUSIPIdentifier;
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
 * Provides the CUSIP identification of a security.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CUSIPIdentification1#mmCUSIPCountry
 * CUSIPIdentification1.mmCUSIPCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CUSIPIdentification1#mmCUSIPIdentification
 * CUSIPIdentification1.mmCUSIPIdentification}</li>
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
 * "CUSIPIdentification1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides the CUSIP identification of a security."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CUSIPIdentification1", propOrder = {"cUSIPCountry", "cUSIPIdentification"})
public class CUSIPIdentification1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CUSIPCtry")
	protected CountryCode cUSIPCountry;
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
	 * {@linkplain com.tools20022.repository.msg.CUSIPIdentification1
	 * CUSIPIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CUSIPCtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: CUSIP Country</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CUSIPCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country in which the CUSIP has been assigned."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CUSIPIdentification1, Optional<CountryCode>> mmCUSIPCountry = new MMMessageAttribute<CUSIPIdentification1, Optional<CountryCode>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CUSIPIdentification1.mmObject();
			isDerived = false;
			xmlTag = "CUSIPCtry";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "CUSIP Country"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CUSIPCountry";
			definition = "Country in which the CUSIP has been assigned.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public Optional<CountryCode> getValue(CUSIPIdentification1 obj) {
			return obj.getCUSIPCountry();
		}

		@Override
		public void setValue(CUSIPIdentification1 obj, Optional<CountryCode> value) {
			obj.setCUSIPCountry(value.orElse(null));
		}
	};
	@XmlElement(name = "CUSIPId", required = true)
	protected CUSIPIdentifier cUSIPIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CUSIPIdentifier
	 * CUSIPIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CUSIPIdentification1
	 * CUSIPIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CUSIPId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: CUSIP ID</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CUSIPIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "CUSIP identification of the security."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CUSIPIdentification1, CUSIPIdentifier> mmCUSIPIdentification = new MMMessageAttribute<CUSIPIdentification1, CUSIPIdentifier>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CUSIPIdentification1.mmObject();
			isDerived = false;
			xmlTag = "CUSIPId";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "CUSIP ID"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CUSIPIdentification";
			definition = "CUSIP identification of the security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CUSIPIdentifier.mmObject();
		}

		@Override
		public CUSIPIdentifier getValue(CUSIPIdentification1 obj) {
			return obj.getCUSIPIdentification();
		}

		@Override
		public void setValue(CUSIPIdentification1 obj, CUSIPIdentifier value) {
			obj.setCUSIPIdentification(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CUSIPIdentification1.mmCUSIPCountry, com.tools20022.repository.msg.CUSIPIdentification1.mmCUSIPIdentification);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CUSIPIdentification1";
				definition = "Provides the CUSIP identification of a security.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<CountryCode> getCUSIPCountry() {
		return cUSIPCountry == null ? Optional.empty() : Optional.of(cUSIPCountry);
	}

	public CUSIPIdentification1 setCUSIPCountry(CountryCode cUSIPCountry) {
		this.cUSIPCountry = cUSIPCountry;
		return this;
	}

	public CUSIPIdentifier getCUSIPIdentification() {
		return cUSIPIdentification;
	}

	public CUSIPIdentification1 setCUSIPIdentification(CUSIPIdentifier cUSIPIdentification) {
		this.cUSIPIdentification = Objects.requireNonNull(cUSIPIdentification);
		return this;
	}
}