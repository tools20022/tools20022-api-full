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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.ReportSortedType1Code;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between pre-defined and user-defined sorting criteria.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SortCriteria1Choice#mmPredefined
 * SortCriteria1Choice.mmPredefined}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SortCriteria1Choice#mmUserDefined
 * SortCriteria1Choice.mmUserDefined}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SortCriteria1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between pre-defined and user-defined sorting criteria."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SortCriteria1Choice", propOrder = {"predefined", "userDefined"})
public class SortCriteria1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected ReportSortedType1Code predefined;
	/**
	 * Pre-defined way of indicating how the information is broken down.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ReportSortedType1Code
	 * ReportSortedType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SortCriteria1Choice
	 * SortCriteria1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prdfnd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Predefined"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Pre-defined way of indicating how the information is broken down."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPredefined = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SortCriteria1Choice.mmObject();
			isDerived = false;
			xmlTag = "Prdfnd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Predefined";
			definition = "Pre-defined way of indicating how the information is broken down.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ReportSortedType1Code.mmObject();
		}
	};
	protected DataFormat1Choice userDefined;
	/**
	 * User-defined way of indicating how the information is broken down.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DataFormat1Choice
	 * DataFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SortCriteria1Choice
	 * SortCriteria1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UsrDfnd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UserDefined"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "User-defined way of indicating how the information is broken down."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUserDefined = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SortCriteria1Choice.mmObject();
			isDerived = false;
			xmlTag = "UsrDfnd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UserDefined";
			definition = "User-defined way of indicating how the information is broken down.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.choice.DataFormat1Choice.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SortCriteria1Choice.mmPredefined, SortCriteria1Choice.mmUserDefined);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SortCriteria1Choice";
				definition = "Choice between pre-defined and user-defined sorting criteria.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Prdfnd", required = true)
	public ReportSortedType1Code getPredefined() {
		return predefined;
	}

	public void setPredefined(ReportSortedType1Code predefined) {
		this.predefined = predefined;
	}

	@XmlElement(name = "UsrDfnd", required = true)
	public DataFormat1Choice getUserDefined() {
		return userDefined;
	}

	public void setUserDefined(com.tools20022.repository.choice.DataFormat1Choice userDefined) {
		this.userDefined = userDefined;
	}
}