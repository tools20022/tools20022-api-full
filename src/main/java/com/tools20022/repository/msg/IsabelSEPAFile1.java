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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max6Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
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
 * Specifies the characteristics for a SEPA formatted payment initiation file.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelSEPAFile1#mmSEPAIndicator
 * IsabelSEPAFile1.mmSEPAIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelSEPAFile1#mmCategoryPurpose
 * IsabelSEPAFile1.mmCategoryPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelSEPAFile1#mmMarketPractices
 * IsabelSEPAFile1.mmMarketPractices}</li>
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
 * "IsabelSEPAFile1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the characteristics for a SEPA formatted payment initiation file."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IsabelSEPAFile1", propOrder = {"sEPAIndicator", "categoryPurpose", "marketPractices"})
public class IsabelSEPAFile1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SEPAInd", required = true)
	protected TrueFalseIndicator sEPAIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelSEPAFile1
	 * IsabelSEPAFile1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SEPAInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SEPAIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the SEPA formatted file is compliant to the SEPA rulebook."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IsabelSEPAFile1, TrueFalseIndicator> mmSEPAIndicator = new MMMessageAttribute<IsabelSEPAFile1, TrueFalseIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelSEPAFile1.mmObject();
			isDerived = false;
			xmlTag = "SEPAInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SEPAIndicator";
			definition = "Specifies whether the SEPA formatted file is compliant to the SEPA rulebook.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public TrueFalseIndicator getValue(IsabelSEPAFile1 obj) {
			return obj.getSEPAIndicator();
		}

		@Override
		public void setValue(IsabelSEPAFile1 obj, TrueFalseIndicator value) {
			obj.setSEPAIndicator(value);
		}
	};
	@XmlElement(name = "CtgyPurp", required = true)
	protected Max6Text categoryPurpose;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max6Text
	 * Max6Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelSEPAFile1
	 * IsabelSEPAFile1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtgyPurp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CategoryPurpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "High level category purpose of the payment initiation messages in the file, based on the SEPA rulebook."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IsabelSEPAFile1, Max6Text> mmCategoryPurpose = new MMMessageAttribute<IsabelSEPAFile1, Max6Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelSEPAFile1.mmObject();
			isDerived = false;
			xmlTag = "CtgyPurp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CategoryPurpose";
			definition = "High level category purpose of the payment initiation messages in the file, based on the SEPA rulebook.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max6Text.mmObject();
		}

		@Override
		public Max6Text getValue(IsabelSEPAFile1 obj) {
			return obj.getCategoryPurpose();
		}

		@Override
		public void setValue(IsabelSEPAFile1 obj, Max6Text value) {
			obj.setCategoryPurpose(value);
		}
	};
	@XmlElement(name = "MktPrctcs")
	protected List<Max35Text> marketPractices;
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
	 * {@linkplain com.tools20022.repository.msg.IsabelSEPAFile1
	 * IsabelSEPAFile1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktPrctcs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketPractices"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Local market practices applicable to the SEPA file."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IsabelSEPAFile1, List<Max35Text>> mmMarketPractices = new MMMessageAttribute<IsabelSEPAFile1, List<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelSEPAFile1.mmObject();
			isDerived = false;
			xmlTag = "MktPrctcs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketPractices";
			definition = "Local market practices applicable to the SEPA file.";
			maxOccurs = 10;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public List<Max35Text> getValue(IsabelSEPAFile1 obj) {
			return obj.getMarketPractices();
		}

		@Override
		public void setValue(IsabelSEPAFile1 obj, List<Max35Text> value) {
			obj.setMarketPractices(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IsabelSEPAFile1.mmSEPAIndicator, com.tools20022.repository.msg.IsabelSEPAFile1.mmCategoryPurpose,
						com.tools20022.repository.msg.IsabelSEPAFile1.mmMarketPractices);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IsabelSEPAFile1";
				definition = "Specifies the characteristics for a SEPA formatted payment initiation file.";
			}
		});
		return mmObject_lazy.get();
	}

	public TrueFalseIndicator getSEPAIndicator() {
		return sEPAIndicator;
	}

	public IsabelSEPAFile1 setSEPAIndicator(TrueFalseIndicator sEPAIndicator) {
		this.sEPAIndicator = Objects.requireNonNull(sEPAIndicator);
		return this;
	}

	public Max6Text getCategoryPurpose() {
		return categoryPurpose;
	}

	public IsabelSEPAFile1 setCategoryPurpose(Max6Text categoryPurpose) {
		this.categoryPurpose = Objects.requireNonNull(categoryPurpose);
		return this;
	}

	public List<Max35Text> getMarketPractices() {
		return marketPractices == null ? marketPractices = new ArrayList<>() : marketPractices;
	}

	public IsabelSEPAFile1 setMarketPractices(List<Max35Text> marketPractices) {
		this.marketPractices = Objects.requireNonNull(marketPractices);
		return this;
	}
}