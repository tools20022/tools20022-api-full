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
import com.tools20022.repository.datatype.CFIOct2015Identifier;
import com.tools20022.repository.datatype.Max52Text;
import com.tools20022.repository.entity.AssetClassification;
import com.tools20022.repository.entity.Product;
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
 * Criteria regarding product classification.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProductClassificationCriteria1#mmClassificationFinancialInstrument
 * ProductClassificationCriteria1.mmClassificationFinancialInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProductClassificationCriteria1#mmUniqueProductIdentifier
 * ProductClassificationCriteria1.mmUniqueProductIdentifier}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.AssetClassification
 * AssetClassification}</li>
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
 * "ProductClassificationCriteria1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Criteria regarding product classification."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ProductClassificationCriteria1", propOrder = {"classificationFinancialInstrument", "uniqueProductIdentifier"})
public class ProductClassificationCriteria1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ClssfctnFinInstrm")
	protected List<CFIOct2015Identifier> classificationFinancialInstrument;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CFIOct2015Identifier
	 * CFIOct2015Identifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetClassification#mmClassificationType
	 * AssetClassification.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ProductClassificationCriteria1
	 * ProductClassificationCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClssfctnFinInstrm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClassificationFinancialInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier is an ISO 10962 Classification of Financial Instrument (CFI)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ProductClassificationCriteria1, List<CFIOct2015Identifier>> mmClassificationFinancialInstrument = new MMMessageAttribute<ProductClassificationCriteria1, List<CFIOct2015Identifier>>() {
		{
			businessElementTrace_lazy = () -> AssetClassification.mmClassificationType;
			componentContext_lazy = () -> com.tools20022.repository.msg.ProductClassificationCriteria1.mmObject();
			isDerived = false;
			xmlTag = "ClssfctnFinInstrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClassificationFinancialInstrument";
			definition = "Identifier is an ISO 10962 Classification of Financial Instrument (CFI).";
			minOccurs = 0;
			simpleType_lazy = () -> CFIOct2015Identifier.mmObject();
		}

		@Override
		public List<CFIOct2015Identifier> getValue(ProductClassificationCriteria1 obj) {
			return obj.getClassificationFinancialInstrument();
		}

		@Override
		public void setValue(ProductClassificationCriteria1 obj, List<CFIOct2015Identifier> value) {
			obj.setClassificationFinancialInstrument(value);
		}
	};
	@XmlElement(name = "UnqPdctIdr")
	protected List<Max52Text> uniqueProductIdentifier;
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
	 * {@linkplain com.tools20022.repository.msg.ProductClassificationCriteria1
	 * ProductClassificationCriteria1}</li>
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
	 * definition} =
	 * "Identifier code is a Unique Product Identifier.\r\n\r\nUsage:\r\nDefined as a text as the UPI identifier is not yet defined/available."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ProductClassificationCriteria1, List<Max52Text>> mmUniqueProductIdentifier = new MMMessageAttribute<ProductClassificationCriteria1, List<Max52Text>>() {
		{
			businessElementTrace_lazy = () -> Product.mmProductIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ProductClassificationCriteria1.mmObject();
			isDerived = false;
			xmlTag = "UnqPdctIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UniqueProductIdentifier";
			definition = "Identifier code is a Unique Product Identifier.\r\n\r\nUsage:\r\nDefined as a text as the UPI identifier is not yet defined/available.";
			minOccurs = 0;
			simpleType_lazy = () -> Max52Text.mmObject();
		}

		@Override
		public List<Max52Text> getValue(ProductClassificationCriteria1 obj) {
			return obj.getUniqueProductIdentifier();
		}

		@Override
		public void setValue(ProductClassificationCriteria1 obj, List<Max52Text> value) {
			obj.setUniqueProductIdentifier(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ProductClassificationCriteria1.mmClassificationFinancialInstrument,
						com.tools20022.repository.msg.ProductClassificationCriteria1.mmUniqueProductIdentifier);
				trace_lazy = () -> AssetClassification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ProductClassificationCriteria1";
				definition = "Criteria regarding product classification.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<CFIOct2015Identifier> getClassificationFinancialInstrument() {
		return classificationFinancialInstrument == null ? classificationFinancialInstrument = new ArrayList<>() : classificationFinancialInstrument;
	}

	public ProductClassificationCriteria1 setClassificationFinancialInstrument(List<CFIOct2015Identifier> classificationFinancialInstrument) {
		this.classificationFinancialInstrument = Objects.requireNonNull(classificationFinancialInstrument);
		return this;
	}

	public List<Max52Text> getUniqueProductIdentifier() {
		return uniqueProductIdentifier == null ? uniqueProductIdentifier = new ArrayList<>() : uniqueProductIdentifier;
	}

	public ProductClassificationCriteria1 setUniqueProductIdentifier(List<Max52Text> uniqueProductIdentifier) {
		this.uniqueProductIdentifier = Objects.requireNonNull(uniqueProductIdentifier);
		return this;
	}
}