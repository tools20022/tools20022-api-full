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
import com.tools20022.repository.choice.BenchmarkCurveName5Choice;
import com.tools20022.repository.entity.Index;
import com.tools20022.repository.entity.VariableInterest;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides the index used to define the rate and optionally the basis point
 * spread.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FloatingInterestRate8#mmReferenceRate
 * FloatingInterestRate8.mmReferenceRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FloatingInterestRate8#mmTerm
 * FloatingInterestRate8.mmTerm}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.VariableInterest
 * VariableInterest}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FloatingInterestRate8"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the index used to define the rate and optionally the basis point spread."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "FloatingInterestRate8", propOrder = {"referenceRate", "term"})
public class FloatingInterestRate8 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected BenchmarkCurveName5Choice referenceRate;
	/**
	 * Identifies the reference index for the instrument. <br>
	 * <br>
	 * Usage:<br>
	 * Index or name if the reference rate is not included in the index list.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BenchmarkCurveName5Choice
	 * BenchmarkCurveName5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Index#mmIdentification
	 * Index.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FloatingInterestRate8
	 * FloatingInterestRate8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RefRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the reference index for the instrument. \r\n\r\nUsage:\r\nIndex or name if the reference rate is not included in the index list."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReferenceRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Index.mmIdentification;
			componentContext_lazy = () -> FloatingInterestRate8.mmObject();
			isDerived = false;
			xmlTag = "RefRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceRate";
			definition = "Identifies the reference index for the instrument. \r\n\r\nUsage:\r\nIndex or name if the reference rate is not included in the index list.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> BenchmarkCurveName5Choice.mmObject();
		}
	};
	protected InterestRateContractTerm2 term;
	/**
	 * Term of the reference rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InterestRateContractTerm2
	 * InterestRateContractTerm2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.VariableInterest#mmDurationCalculation
	 * VariableInterest.mmDurationCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FloatingInterestRate8
	 * FloatingInterestRate8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Term"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Term"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Term of the reference rate."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTerm = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> VariableInterest.mmDurationCalculation;
			componentContext_lazy = () -> FloatingInterestRate8.mmObject();
			isDerived = false;
			xmlTag = "Term";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Term";
			definition = "Term of the reference rate.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InterestRateContractTerm2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(FloatingInterestRate8.mmReferenceRate, FloatingInterestRate8.mmTerm);
				trace_lazy = () -> VariableInterest.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FloatingInterestRate8";
				definition = "Provides the index used to define the rate and optionally the basis point spread.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "RefRate", required = true)
	public BenchmarkCurveName5Choice getReferenceRate() {
		return referenceRate;
	}

	public void setReferenceRate(BenchmarkCurveName5Choice referenceRate) {
		this.referenceRate = referenceRate;
	}

	@XmlElement(name = "Term")
	public InterestRateContractTerm2 getTerm() {
		return term;
	}

	public void setTerm(com.tools20022.repository.msg.InterestRateContractTerm2 term) {
		this.term = term;
	}
}