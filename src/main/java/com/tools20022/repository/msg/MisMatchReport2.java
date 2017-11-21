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
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Description of the mis-matched situation between two baselines or between a
 * baseline and a data set.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MisMatchReport2#mmNumberOfMisMatches
 * MisMatchReport2.mmNumberOfMisMatches}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MisMatchReport2#mmMisMatchInformation
 * MisMatchReport2.mmMisMatchInformation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MisMatchReport2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Description of the mis-matched situation between two baselines or between a baseline and a data set."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "MisMatchReport2", propOrder = {"numberOfMisMatches", "misMatchInformation"})
public class MisMatchReport2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Number numberOfMisMatches;
	/**
	 * Total number of mismatches between two baselines or between one baseline
	 * and one data set.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MisMatchReport2
	 * MisMatchReport2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfMisMtchs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfMisMatches"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total number of mismatches between two baselines or between one baseline and one data set."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNumberOfMisMatches = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MisMatchReport2.mmObject();
			isDerived = false;
			xmlTag = "NbOfMisMtchs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfMisMatches";
			definition = "Total number of mismatches between two baselines or between one baseline and one data set.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.ValidationResult4> misMatchInformation;
	/**
	 * Details of each mismatch occurrence.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ValidationResult4
	 * ValidationResult4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MisMatchReport2
	 * MisMatchReport2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MisMtchInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MisMatchInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of each mismatch occurrence."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMisMatchInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MisMatchReport2.mmObject();
			isDerived = false;
			xmlTag = "MisMtchInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MisMatchInformation";
			definition = "Details of each mismatch occurrence.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ValidationResult4.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(MisMatchReport2.mmNumberOfMisMatches, MisMatchReport2.mmMisMatchInformation);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "MisMatchReport2";
				definition = "Description of the mis-matched situation between two baselines or between a baseline and a data set.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "NbOfMisMtchs", required = true)
	public Number getNumberOfMisMatches() {
		return numberOfMisMatches;
	}

	public void setNumberOfMisMatches(Number numberOfMisMatches) {
		this.numberOfMisMatches = numberOfMisMatches;
	}

	@XmlElement(name = "MisMtchInf")
	public List<ValidationResult4> getMisMatchInformation() {
		return misMatchInformation;
	}

	public void setMisMatchInformation(List<com.tools20022.repository.msg.ValidationResult4> misMatchInformation) {
		this.misMatchInformation = misMatchInformation;
	}
}