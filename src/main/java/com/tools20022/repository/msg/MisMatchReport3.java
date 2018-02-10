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
import com.tools20022.repository.area.tsmt.BaselineMatchReportV03;
import com.tools20022.repository.area.tsmt.DataSetMatchReportV03;
import com.tools20022.repository.datatype.Number;
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
 * {@linkplain com.tools20022.repository.msg.MisMatchReport3#mmNumberOfMisMatches
 * MisMatchReport3.mmNumberOfMisMatches}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MisMatchReport3#mmMisMatchInformation
 * MisMatchReport3.mmMisMatchInformation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineMatchReportV03#mmReport
 * BaselineMatchReportV03.mmReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetMatchReportV03#mmReport
 * DataSetMatchReportV03.mmReport}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MisMatchReport3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Description of the mis-matched situation between two baselines or between a baseline and a data set."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MisMatchReport3", propOrder = {"numberOfMisMatches", "misMatchInformation"})
public class MisMatchReport3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "NbOfMisMtchs", required = true)
	protected Number numberOfMisMatches;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MisMatchReport3
	 * MisMatchReport3}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.MisMatchReport3.mmObject();
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
	@XmlElement(name = "MisMtchInf")
	protected List<com.tools20022.repository.msg.ValidationResult5> misMatchInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ValidationResult5
	 * ValidationResult5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MisMatchReport3
	 * MisMatchReport3}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.MisMatchReport3.mmObject();
			isDerived = false;
			xmlTag = "MisMtchInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MisMatchInformation";
			definition = "Details of each mismatch occurrence.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ValidationResult5.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MisMatchReport3.mmNumberOfMisMatches, com.tools20022.repository.msg.MisMatchReport3.mmMisMatchInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(BaselineMatchReportV03.mmReport, DataSetMatchReportV03.mmReport);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MisMatchReport3";
				definition = "Description of the mis-matched situation between two baselines or between a baseline and a data set.";
			}
		});
		return mmObject_lazy.get();
	}

	public Number getNumberOfMisMatches() {
		return numberOfMisMatches;
	}

	public MisMatchReport3 setNumberOfMisMatches(Number numberOfMisMatches) {
		this.numberOfMisMatches = Objects.requireNonNull(numberOfMisMatches);
		return this;
	}

	public List<ValidationResult5> getMisMatchInformation() {
		return misMatchInformation == null ? misMatchInformation = new ArrayList<>() : misMatchInformation;
	}

	public MisMatchReport3 setMisMatchInformation(List<com.tools20022.repository.msg.ValidationResult5> misMatchInformation) {
		this.misMatchInformation = Objects.requireNonNull(misMatchInformation);
		return this;
	}
}