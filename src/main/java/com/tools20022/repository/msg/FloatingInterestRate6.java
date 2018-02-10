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
import com.tools20022.repository.choice.BenchmarkCurveName6Choice;
import com.tools20022.repository.datatype.Max5Number;
import com.tools20022.repository.entity.Index;
import com.tools20022.repository.entity.Spread;
import com.tools20022.repository.entity.VariableInterest;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides the index used to define the rate and the basis point spread.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FloatingInterestRate6#mmReferenceRate
 * FloatingInterestRate6.mmReferenceRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FloatingInterestRate6#mmTerm
 * FloatingInterestRate6.mmTerm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FloatingInterestRate6#mmBasisPointSpread
 * FloatingInterestRate6.mmBasisPointSpread}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.VariableInterest
 * VariableInterest}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FloatingInterestRate6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the index used to define the rate and the basis point spread."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.FloatingInterestRate4
 * FloatingInterestRate4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FloatingInterestRate6", propOrder = {"referenceRate", "term", "basisPointSpread"})
public class FloatingInterestRate6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RefRate", required = true)
	protected BenchmarkCurveName6Choice referenceRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BenchmarkCurveName6Choice
	 * BenchmarkCurveName6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Index#mmIdentification
	 * Index.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FloatingInterestRate6
	 * FloatingInterestRate6}</li>
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
	 * definition} = "Identifies the reference index for the debt instrument."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FloatingInterestRate4#mmReferenceRate
	 * FloatingInterestRate4.mmReferenceRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReferenceRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Index.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.FloatingInterestRate6.mmObject();
			isDerived = false;
			xmlTag = "RefRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceRate";
			definition = "Identifies the reference index for the debt instrument.";
			previousVersion_lazy = () -> FloatingInterestRate4.mmReferenceRate;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> BenchmarkCurveName6Choice.mmObject();
		}
	};
	@XmlElement(name = "Term", required = true)
	protected InterestRateContractTerm2 term;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.FloatingInterestRate6
	 * FloatingInterestRate6}</li>
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
	 * definition} =
	 * "Term of the index/benchmark of a floating rate bond. The term shall be expressed in days, weeks, months or years."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FloatingInterestRate4#mmTerm
	 * FloatingInterestRate4.mmTerm}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTerm = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> VariableInterest.mmDurationCalculation;
			componentContext_lazy = () -> com.tools20022.repository.msg.FloatingInterestRate6.mmObject();
			isDerived = false;
			xmlTag = "Term";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Term";
			definition = "Term of the index/benchmark of a floating rate bond. The term shall be expressed in days, weeks, months or years.";
			previousVersion_lazy = () -> FloatingInterestRate4.mmTerm;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InterestRateContractTerm2.mmObject();
		}
	};
	@XmlElement(name = "BsisPtSprd", required = true)
	protected Max5Number basisPointSpread;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max5Number
	 * Max5Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Spread#mmBasisPointSpread
	 * Spread.mmBasisPointSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FloatingInterestRate6
	 * FloatingInterestRate6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BsisPtSprd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BasisPointSpread"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of basis points above (if positive) or below (if negative) the underlying reference rate to calculate the actual interest rate applicable for a given period at issuance of the floating rate instrument.\r\n\r\nUsage:\r\nUsed to express differences in interest rates, for example, a difference of 0.10% is equivalent to a change of 10 basis points."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FloatingInterestRate4#mmBasisPointSpread
	 * FloatingInterestRate4.mmBasisPointSpread}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBasisPointSpread = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Spread.mmBasisPointSpread;
			componentContext_lazy = () -> com.tools20022.repository.msg.FloatingInterestRate6.mmObject();
			isDerived = false;
			xmlTag = "BsisPtSprd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BasisPointSpread";
			definition = "Number of basis points above (if positive) or below (if negative) the underlying reference rate to calculate the actual interest rate applicable for a given period at issuance of the floating rate instrument.\r\n\r\nUsage:\r\nUsed to express differences in interest rates, for example, a difference of 0.10% is equivalent to a change of 10 basis points.";
			previousVersion_lazy = () -> FloatingInterestRate4.mmBasisPointSpread;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max5Number.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FloatingInterestRate6.mmReferenceRate, com.tools20022.repository.msg.FloatingInterestRate6.mmTerm,
						com.tools20022.repository.msg.FloatingInterestRate6.mmBasisPointSpread);
				trace_lazy = () -> VariableInterest.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FloatingInterestRate6";
				definition = "Provides the index used to define the rate and the basis point spread.";
				previousVersion_lazy = () -> FloatingInterestRate4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public BenchmarkCurveName6Choice getReferenceRate() {
		return referenceRate;
	}

	public FloatingInterestRate6 setReferenceRate(BenchmarkCurveName6Choice referenceRate) {
		this.referenceRate = Objects.requireNonNull(referenceRate);
		return this;
	}

	public InterestRateContractTerm2 getTerm() {
		return term;
	}

	public FloatingInterestRate6 setTerm(com.tools20022.repository.msg.InterestRateContractTerm2 term) {
		this.term = Objects.requireNonNull(term);
		return this;
	}

	public Max5Number getBasisPointSpread() {
		return basisPointSpread;
	}

	public FloatingInterestRate6 setBasisPointSpread(Max5Number basisPointSpread) {
		this.basisPointSpread = Objects.requireNonNull(basisPointSpread);
		return this;
	}
}