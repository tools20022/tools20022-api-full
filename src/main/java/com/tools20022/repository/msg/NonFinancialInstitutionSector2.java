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
import com.tools20022.repository.datatype.NACEDomainIdentifier;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.NonFinancialInstitution;
import com.tools20022.repository.entity.Organisation;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides detailed information concerning non financial counterparties.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonFinancialInstitutionSector2#mmSector
 * NonFinancialInstitutionSector2.mmSector}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonFinancialInstitutionSector2#mmClearingThreshold
 * NonFinancialInstitutionSector2.mmClearingThreshold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonFinancialInstitutionSector2#mmDirectlyLinkedActivity
 * NonFinancialInstitutionSector2.mmDirectlyLinkedActivity}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.NonFinancialInstitution
 * NonFinancialInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NonFinancialInstitutionSector2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides detailed information concerning non financial counterparties."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.NonFinancialInstitutionSector1
 * NonFinancialInstitutionSector1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "NonFinancialInstitutionSector2", propOrder = {"sector", "clearingThreshold", "directlyLinkedActivity"})
public class NonFinancialInstitutionSector2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Sctr")
	protected List<NACEDomainIdentifier> sector;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.NACEDomainIdentifier
	 * NACEDomainIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmSector
	 * Organisation.mmSector}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NonFinancialInstitutionSector2
	 * NonFinancialInstitutionSector2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sctr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Sector"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Taxonomy for non-financial counterparties. The categories correspond to the main sections of NACE classification as defined in the regulation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.NonFinancialInstitutionSector1#mmSector
	 * NonFinancialInstitutionSector1.mmSector}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NonFinancialInstitutionSector2, List<NACEDomainIdentifier>> mmSector = new MMMessageAttribute<NonFinancialInstitutionSector2, List<NACEDomainIdentifier>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmSector;
			componentContext_lazy = () -> com.tools20022.repository.msg.NonFinancialInstitutionSector2.mmObject();
			isDerived = false;
			xmlTag = "Sctr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Sector";
			definition = "Taxonomy for non-financial counterparties. The categories correspond to the main sections of NACE classification as defined in the regulation.";
			previousVersion_lazy = () -> NonFinancialInstitutionSector1.mmSector;
			minOccurs = 0;
			simpleType_lazy = () -> NACEDomainIdentifier.mmObject();
		}

		@Override
		public List<NACEDomainIdentifier> getValue(NonFinancialInstitutionSector2 obj) {
			return obj.getSector();
		}

		@Override
		public void setValue(NonFinancialInstitutionSector2 obj, List<NACEDomainIdentifier> value) {
			obj.setSector(value);
		}
	};
	@XmlElement(name = "ClrThrshld")
	protected TrueFalseIndicator clearingThreshold;
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
	 * {@linkplain com.tools20022.repository.msg.NonFinancialInstitutionSector2
	 * NonFinancialInstitutionSector2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrThrshld"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingThreshold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information whether the reporting counterparty is above the clearing threshold."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.NonFinancialInstitutionSector1#mmClearingThreshold
	 * NonFinancialInstitutionSector1.mmClearingThreshold}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NonFinancialInstitutionSector2, Optional<TrueFalseIndicator>> mmClearingThreshold = new MMMessageAttribute<NonFinancialInstitutionSector2, Optional<TrueFalseIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NonFinancialInstitutionSector2.mmObject();
			isDerived = false;
			xmlTag = "ClrThrshld";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingThreshold";
			definition = "Information whether the reporting counterparty is above the clearing threshold.";
			previousVersion_lazy = () -> NonFinancialInstitutionSector1.mmClearingThreshold;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(NonFinancialInstitutionSector2 obj) {
			return obj.getClearingThreshold();
		}

		@Override
		public void setValue(NonFinancialInstitutionSector2 obj, Optional<TrueFalseIndicator> value) {
			obj.setClearingThreshold(value.orElse(null));
		}
	};
	@XmlElement(name = "DrctlyLkdActvty")
	protected TrueFalseIndicator directlyLinkedActivity;
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
	 * {@linkplain com.tools20022.repository.msg.NonFinancialInstitutionSector2
	 * NonFinancialInstitutionSector2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DrctlyLkdActvty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DirectlyLinkedActivity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Directly linked to commercial activity or treasury financing: Information on whether the contract is objectively measurable as directly linked to the reporting counterparty's commercial or treasury financing activity."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.NonFinancialInstitutionSector1#mmDirectlyLinkedActivity
	 * NonFinancialInstitutionSector1.mmDirectlyLinkedActivity}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NonFinancialInstitutionSector2, Optional<TrueFalseIndicator>> mmDirectlyLinkedActivity = new MMMessageAttribute<NonFinancialInstitutionSector2, Optional<TrueFalseIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NonFinancialInstitutionSector2.mmObject();
			isDerived = false;
			xmlTag = "DrctlyLkdActvty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DirectlyLinkedActivity";
			definition = "Directly linked to commercial activity or treasury financing: Information on whether the contract is objectively measurable as directly linked to the reporting counterparty's commercial or treasury financing activity.";
			previousVersion_lazy = () -> NonFinancialInstitutionSector1.mmDirectlyLinkedActivity;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(NonFinancialInstitutionSector2 obj) {
			return obj.getDirectlyLinkedActivity();
		}

		@Override
		public void setValue(NonFinancialInstitutionSector2 obj, Optional<TrueFalseIndicator> value) {
			obj.setDirectlyLinkedActivity(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.NonFinancialInstitutionSector2.mmSector, com.tools20022.repository.msg.NonFinancialInstitutionSector2.mmClearingThreshold,
						com.tools20022.repository.msg.NonFinancialInstitutionSector2.mmDirectlyLinkedActivity);
				trace_lazy = () -> NonFinancialInstitution.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "NonFinancialInstitutionSector2";
				definition = "Provides detailed information concerning non financial counterparties.";
				previousVersion_lazy = () -> NonFinancialInstitutionSector1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<NACEDomainIdentifier> getSector() {
		return sector == null ? sector = new ArrayList<>() : sector;
	}

	public NonFinancialInstitutionSector2 setSector(List<NACEDomainIdentifier> sector) {
		this.sector = Objects.requireNonNull(sector);
		return this;
	}

	public Optional<TrueFalseIndicator> getClearingThreshold() {
		return clearingThreshold == null ? Optional.empty() : Optional.of(clearingThreshold);
	}

	public NonFinancialInstitutionSector2 setClearingThreshold(TrueFalseIndicator clearingThreshold) {
		this.clearingThreshold = clearingThreshold;
		return this;
	}

	public Optional<TrueFalseIndicator> getDirectlyLinkedActivity() {
		return directlyLinkedActivity == null ? Optional.empty() : Optional.of(directlyLinkedActivity);
	}

	public NonFinancialInstitutionSector2 setDirectlyLinkedActivity(TrueFalseIndicator directlyLinkedActivity) {
		this.directlyLinkedActivity = directlyLinkedActivity;
		return this;
	}
}