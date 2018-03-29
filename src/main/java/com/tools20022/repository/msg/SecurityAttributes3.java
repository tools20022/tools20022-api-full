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
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CommonFinancialInstrumentAttributes3;
import com.tools20022.repository.msg.FinancialInstrument28;
import com.tools20022.repository.msg.SecurityIdentification14;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Tangible items of value to a business.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityAttributes3#mmFinancialInstrumentIdentification
 * SecurityAttributes3.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityAttributes3#mmFinancialInstrumentType
 * SecurityAttributes3.mmFinancialInstrumentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityAttributes3#mmFinancialInstrumentAttributes
 * SecurityAttributes3.mmFinancialInstrumentAttributes}</li>
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
 * "SecurityAttributes3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Tangible items of value to a business."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityAttributes4
 * SecurityAttributes4}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecurityAttributes3", propOrder = {"financialInstrumentIdentification", "financialInstrumentType", "financialInstrumentAttributes"})
public class SecurityAttributes3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "FinInstrmId")
	protected List<SecurityIdentification14> financialInstrumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification14
	 * SecurityIdentification14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityAttributes3
	 * SecurityAttributes3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Way(s) of identifying the security."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityAttributes4#mmFinancialInstrumentIdentification
	 * SecurityAttributes4.mmFinancialInstrumentIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecurityAttributes3, List<SecurityIdentification14>> mmFinancialInstrumentIdentification = new MMMessageAssociationEnd<SecurityAttributes3, List<SecurityIdentification14>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityAttributes3.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Way(s) of identifying the security.";
			nextVersions_lazy = () -> Arrays.asList(SecurityAttributes4.mmFinancialInstrumentIdentification);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecurityIdentification14.mmObject();
		}

		@Override
		public List<SecurityIdentification14> getValue(SecurityAttributes3 obj) {
			return obj.getFinancialInstrumentIdentification();
		}

		@Override
		public void setValue(SecurityAttributes3 obj, List<SecurityIdentification14> value) {
			obj.setFinancialInstrumentIdentification(value);
		}
	};
	@XmlElement(name = "FinInstrmTp")
	protected FinancialInstrument28 financialInstrumentType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstrument28
	 * FinancialInstrument28}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityAttributes3
	 * SecurityAttributes3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional details about the financial instrument."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityAttributes4#mmFinancialInstrumentType
	 * SecurityAttributes4.mmFinancialInstrumentType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecurityAttributes3, Optional<FinancialInstrument28>> mmFinancialInstrumentType = new MMMessageAssociationEnd<SecurityAttributes3, Optional<FinancialInstrument28>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityAttributes3.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentType";
			definition = "Provides additional details about the financial instrument.";
			nextVersions_lazy = () -> Arrays.asList(SecurityAttributes4.mmFinancialInstrumentType);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrument28.mmObject();
		}

		@Override
		public Optional<FinancialInstrument28> getValue(SecurityAttributes3 obj) {
			return obj.getFinancialInstrumentType();
		}

		@Override
		public void setValue(SecurityAttributes3 obj, Optional<FinancialInstrument28> value) {
			obj.setFinancialInstrumentType(value.orElse(null));
		}
	};
	@XmlElement(name = "FinInstrmAttrbts")
	protected List<CommonFinancialInstrumentAttributes3> financialInstrumentAttributes;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes3
	 * CommonFinancialInstrumentAttributes3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityAttributes3
	 * SecurityAttributes3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmAttrbts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instruments representing a sum of rights of the investor vis-a-vis the issuer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityAttributes4#mmFinancialInstrumentAttributes
	 * SecurityAttributes4.mmFinancialInstrumentAttributes}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecurityAttributes3, List<CommonFinancialInstrumentAttributes3>> mmFinancialInstrumentAttributes = new MMMessageAssociationEnd<SecurityAttributes3, List<CommonFinancialInstrumentAttributes3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityAttributes3.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributes";
			definition = "Financial instruments representing a sum of rights of the investor vis-a-vis the issuer.";
			nextVersions_lazy = () -> Arrays.asList(SecurityAttributes4.mmFinancialInstrumentAttributes);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CommonFinancialInstrumentAttributes3.mmObject();
		}

		@Override
		public List<CommonFinancialInstrumentAttributes3> getValue(SecurityAttributes3 obj) {
			return obj.getFinancialInstrumentAttributes();
		}

		@Override
		public void setValue(SecurityAttributes3 obj, List<CommonFinancialInstrumentAttributes3> value) {
			obj.setFinancialInstrumentAttributes(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecurityAttributes3.mmFinancialInstrumentIdentification, com.tools20022.repository.msg.SecurityAttributes3.mmFinancialInstrumentType,
						com.tools20022.repository.msg.SecurityAttributes3.mmFinancialInstrumentAttributes);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SecurityAttributes3";
				definition = "Tangible items of value to a business.";
				nextVersions_lazy = () -> Arrays.asList(SecurityAttributes4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public List<SecurityIdentification14> getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification == null ? financialInstrumentIdentification = new ArrayList<>() : financialInstrumentIdentification;
	}

	public SecurityAttributes3 setFinancialInstrumentIdentification(List<SecurityIdentification14> financialInstrumentIdentification) {
		this.financialInstrumentIdentification = Objects.requireNonNull(financialInstrumentIdentification);
		return this;
	}

	public Optional<FinancialInstrument28> getFinancialInstrumentType() {
		return financialInstrumentType == null ? Optional.empty() : Optional.of(financialInstrumentType);
	}

	public SecurityAttributes3 setFinancialInstrumentType(FinancialInstrument28 financialInstrumentType) {
		this.financialInstrumentType = financialInstrumentType;
		return this;
	}

	public List<CommonFinancialInstrumentAttributes3> getFinancialInstrumentAttributes() {
		return financialInstrumentAttributes == null ? financialInstrumentAttributes = new ArrayList<>() : financialInstrumentAttributes;
	}

	public SecurityAttributes3 setFinancialInstrumentAttributes(List<CommonFinancialInstrumentAttributes3> financialInstrumentAttributes) {
		this.financialInstrumentAttributes = Objects.requireNonNull(financialInstrumentAttributes);
		return this;
	}
}