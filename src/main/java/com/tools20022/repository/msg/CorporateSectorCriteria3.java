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
import com.tools20022.repository.codeset.FinancialPartySectorType1Code;
import com.tools20022.repository.codeset.NonFinancialPartySector1Code;
import com.tools20022.repository.codeset.NotReported1Code;
import com.tools20022.repository.entity.Sector;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Taxonomy for financial and non financial counterparties.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateSectorCriteria3#mmFinancialInstitutionSector
 * CorporateSectorCriteria3.mmFinancialInstitutionSector}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateSectorCriteria3#mmNonFinancialInstitutionSector
 * CorporateSectorCriteria3.mmNonFinancialInstitutionSector}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateSectorCriteria3#mmNotReported
 * CorporateSectorCriteria3.mmNotReported}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Sector Sector}</li>
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
 * "CorporateSectorCriteria3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Taxonomy for financial and non financial counterparties."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateSectorCriteria3", propOrder = {"financialInstitutionSector", "nonFinancialInstitutionSector", "notReported"})
public class CorporateSectorCriteria3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "FISctr")
	protected List<FinancialPartySectorType1Code> financialInstitutionSector;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialPartySectorType1Code
	 * FinancialPartySectorType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Sector#mmIdentification
	 * Sector.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateSectorCriteria3
	 * CorporateSectorCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FISctr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstitutionSector"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that reporting counterparty is a financial institution.\r\n\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateSectorCriteria3, List<FinancialPartySectorType1Code>> mmFinancialInstitutionSector = new MMMessageAttribute<CorporateSectorCriteria3, List<FinancialPartySectorType1Code>>() {
		{
			businessElementTrace_lazy = () -> Sector.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateSectorCriteria3.mmObject();
			isDerived = false;
			xmlTag = "FISctr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstitutionSector";
			definition = "Indicates that reporting counterparty is a financial institution.\r\n\r\n";
			minOccurs = 0;
			simpleType_lazy = () -> FinancialPartySectorType1Code.mmObject();
		}

		@Override
		public List<FinancialPartySectorType1Code> getValue(CorporateSectorCriteria3 obj) {
			return obj.getFinancialInstitutionSector();
		}

		@Override
		public void setValue(CorporateSectorCriteria3 obj, List<FinancialPartySectorType1Code> value) {
			obj.setFinancialInstitutionSector(value);
		}
	};
	@XmlElement(name = "NFISctr")
	protected List<NonFinancialPartySector1Code> nonFinancialInstitutionSector;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.NonFinancialPartySector1Code
	 * NonFinancialPartySector1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Sector#mmIdentification
	 * Sector.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateSectorCriteria3
	 * CorporateSectorCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NFISctr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonFinancialInstitutionSector"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that reporting counterparty is a non financial institution."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateSectorCriteria3, List<NonFinancialPartySector1Code>> mmNonFinancialInstitutionSector = new MMMessageAttribute<CorporateSectorCriteria3, List<NonFinancialPartySector1Code>>() {
		{
			businessElementTrace_lazy = () -> Sector.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateSectorCriteria3.mmObject();
			isDerived = false;
			xmlTag = "NFISctr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonFinancialInstitutionSector";
			definition = "Indicates that reporting counterparty is a non financial institution.";
			minOccurs = 0;
			simpleType_lazy = () -> NonFinancialPartySector1Code.mmObject();
		}

		@Override
		public List<NonFinancialPartySector1Code> getValue(CorporateSectorCriteria3 obj) {
			return obj.getNonFinancialInstitutionSector();
		}

		@Override
		public void setValue(CorporateSectorCriteria3 obj, List<NonFinancialPartySector1Code> value) {
			obj.setNonFinancialInstitutionSector(value);
		}
	};
	@XmlElement(name = "NotRptd")
	protected NotReported1Code notReported;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.NotReported1Code
	 * NotReported1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateSectorCriteria3
	 * CorporateSectorCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NotRptd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotReported"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that reporting counterparty is another type of counterparty as defined by specific regulations (e.g. a CCP) and the detailed sector is not reported."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateSectorCriteria3, Optional<NotReported1Code>> mmNotReported = new MMMessageAttribute<CorporateSectorCriteria3, Optional<NotReported1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateSectorCriteria3.mmObject();
			isDerived = false;
			xmlTag = "NotRptd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotReported";
			definition = "Indicates that reporting counterparty is another type of counterparty as defined by specific regulations (e.g. a CCP) and the detailed sector is not reported.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> NotReported1Code.mmObject();
		}

		@Override
		public Optional<NotReported1Code> getValue(CorporateSectorCriteria3 obj) {
			return obj.getNotReported();
		}

		@Override
		public void setValue(CorporateSectorCriteria3 obj, Optional<NotReported1Code> value) {
			obj.setNotReported(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateSectorCriteria3.mmFinancialInstitutionSector, com.tools20022.repository.msg.CorporateSectorCriteria3.mmNonFinancialInstitutionSector,
						com.tools20022.repository.msg.CorporateSectorCriteria3.mmNotReported);
				trace_lazy = () -> Sector.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CorporateSectorCriteria3";
				definition = "Taxonomy for financial and non financial counterparties.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<FinancialPartySectorType1Code> getFinancialInstitutionSector() {
		return financialInstitutionSector == null ? financialInstitutionSector = new ArrayList<>() : financialInstitutionSector;
	}

	public CorporateSectorCriteria3 setFinancialInstitutionSector(List<FinancialPartySectorType1Code> financialInstitutionSector) {
		this.financialInstitutionSector = Objects.requireNonNull(financialInstitutionSector);
		return this;
	}

	public List<NonFinancialPartySector1Code> getNonFinancialInstitutionSector() {
		return nonFinancialInstitutionSector == null ? nonFinancialInstitutionSector = new ArrayList<>() : nonFinancialInstitutionSector;
	}

	public CorporateSectorCriteria3 setNonFinancialInstitutionSector(List<NonFinancialPartySector1Code> nonFinancialInstitutionSector) {
		this.nonFinancialInstitutionSector = Objects.requireNonNull(nonFinancialInstitutionSector);
		return this;
	}

	public Optional<NotReported1Code> getNotReported() {
		return notReported == null ? Optional.empty() : Optional.of(notReported);
	}

	public CorporateSectorCriteria3 setNotReported(NotReported1Code notReported) {
		this.notReported = notReported;
		return this;
	}
}