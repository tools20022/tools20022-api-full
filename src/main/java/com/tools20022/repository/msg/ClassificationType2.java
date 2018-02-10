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
import com.tools20022.repository.codeset.ExternalFinancialInstrumentProductType1Code;
import com.tools20022.repository.datatype.CFIOct2015Identifier;
import com.tools20022.repository.entity.AssetClassification;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of format for the classification.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClassificationType2#mmClassificationFinancialInstrument
 * ClassificationType2.mmClassificationFinancialInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClassificationType2#mmFinancialInstrumentProductTypeCode
 * ClassificationType2.mmFinancialInstrumentProductTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ClassificationType2#mmAlternateClassification
 * ClassificationType2.mmAlternateClassification}</li>
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
 * "ClassificationType2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of format for the classification."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ClassificationType1
 * ClassificationType1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ClassificationType2", propOrder = {"classificationFinancialInstrument", "financialInstrumentProductTypeCode", "alternateClassification"})
public class ClassificationType2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ClssfctnFinInstrm")
	protected CFIOct2015Identifier classificationFinancialInstrument;
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
	 * {@linkplain com.tools20022.repository.msg.ClassificationType2
	 * ClassificationType2}</li>
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
	 * "Classification type of the financial instrument, as per the ISO Classification of Financial Instrument (CFI) codification, for example, common share with voting rights, fully paid, or registered."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ClassificationType1#mmClassificationFinancialInstrument
	 * ClassificationType1.mmClassificationFinancialInstrument}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClassificationFinancialInstrument = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AssetClassification.mmClassificationType;
			componentContext_lazy = () -> com.tools20022.repository.msg.ClassificationType2.mmObject();
			isDerived = false;
			xmlTag = "ClssfctnFinInstrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClassificationFinancialInstrument";
			definition = "Classification type of the financial instrument, as per the ISO Classification of Financial Instrument (CFI) codification, for example, common share with voting rights, fully paid, or registered.";
			previousVersion_lazy = () -> ClassificationType1.mmClassificationFinancialInstrument;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CFIOct2015Identifier.mmObject();
		}
	};
	@XmlElement(name = "FinInstrmPdctTpCd")
	protected ExternalFinancialInstrumentProductType1Code financialInstrumentProductTypeCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalFinancialInstrumentProductType1Code
	 * ExternalFinancialInstrumentProductType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetClassification#mmProductType
	 * AssetClassification.mmProductType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ClassificationType2
	 * ClassificationType2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmPdctTpCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentProductTypeCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of the identification scheme, in a coded form as published in an external list."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ClassificationType1#mmFinancialInstrumentProductTypeCode
	 * ClassificationType1.mmFinancialInstrumentProductTypeCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFinancialInstrumentProductTypeCode = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AssetClassification.mmProductType;
			componentContext_lazy = () -> com.tools20022.repository.msg.ClassificationType2.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmPdctTpCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentProductTypeCode";
			definition = "Name of the identification scheme, in a coded form as published in an external list.";
			previousVersion_lazy = () -> ClassificationType1.mmFinancialInstrumentProductTypeCode;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ExternalFinancialInstrumentProductType1Code.mmObject();
		}
	};
	@XmlElement(name = "AltrnClssfctn")
	protected List<com.tools20022.repository.msg.GenericIdentification36> alternateClassification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification36
	 * GenericIdentification36}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetClassification#mmClassificationType
	 * AssetClassification.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ClassificationType2
	 * ClassificationType2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AltrnClssfctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlternateClassification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Proprietary classification of financial instrument."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ClassificationType1#mmAlternateClassification
	 * ClassificationType1.mmAlternateClassification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAlternateClassification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AssetClassification.mmClassificationType;
			componentContext_lazy = () -> com.tools20022.repository.msg.ClassificationType2.mmObject();
			isDerived = false;
			xmlTag = "AltrnClssfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AlternateClassification";
			definition = "Proprietary classification of financial instrument.";
			previousVersion_lazy = () -> ClassificationType1.mmAlternateClassification;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.GenericIdentification36.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ClassificationType2.mmClassificationFinancialInstrument, com.tools20022.repository.msg.ClassificationType2.mmFinancialInstrumentProductTypeCode,
						com.tools20022.repository.msg.ClassificationType2.mmAlternateClassification);
				trace_lazy = () -> AssetClassification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ClassificationType2";
				definition = "Choice of format for the classification.";
				previousVersion_lazy = () -> ClassificationType1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<CFIOct2015Identifier> getClassificationFinancialInstrument() {
		return classificationFinancialInstrument == null ? Optional.empty() : Optional.of(classificationFinancialInstrument);
	}

	public ClassificationType2 setClassificationFinancialInstrument(CFIOct2015Identifier classificationFinancialInstrument) {
		this.classificationFinancialInstrument = classificationFinancialInstrument;
		return this;
	}

	public Optional<ExternalFinancialInstrumentProductType1Code> getFinancialInstrumentProductTypeCode() {
		return financialInstrumentProductTypeCode == null ? Optional.empty() : Optional.of(financialInstrumentProductTypeCode);
	}

	public ClassificationType2 setFinancialInstrumentProductTypeCode(ExternalFinancialInstrumentProductType1Code financialInstrumentProductTypeCode) {
		this.financialInstrumentProductTypeCode = financialInstrumentProductTypeCode;
		return this;
	}

	public List<GenericIdentification36> getAlternateClassification() {
		return alternateClassification == null ? alternateClassification = new ArrayList<>() : alternateClassification;
	}

	public ClassificationType2 setAlternateClassification(List<com.tools20022.repository.msg.GenericIdentification36> alternateClassification) {
		this.alternateClassification = Objects.requireNonNull(alternateClassification);
		return this;
	}
}