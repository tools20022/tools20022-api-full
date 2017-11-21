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
import com.tools20022.repository.datatype.ISOYear;
import com.tools20022.repository.datatype.PreviousAll;
import com.tools20022.repository.entity.PortfolioTransfer;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between selected investment plans issued during previous years or the
 * entirety of the investment plans.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PreviousYearChoice#mmAllPreviousYears
 * PreviousYearChoice.mmAllPreviousYears}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PreviousYearChoice#mmSpecificPreviousYears
 * PreviousYearChoice.mmSpecificPreviousYears}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PortfolioTransfer
 * PortfolioTransfer}</li>
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
 * "PreviousYearChoice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between selected investment plans issued during previous years or the entirety of the investment plans."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PreviousYearChoice", propOrder = {"allPreviousYears", "specificPreviousYears"})
public class PreviousYearChoice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected PreviousAll allPreviousYears;
	/**
	 * Selection ot the entirety of the investment plans.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.PreviousAll
	 * PreviousAll}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PreviousYearChoice
	 * PreviousYearChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AllPrvsYrs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllPreviousYears"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Selection ot the entirety of the investment plans."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAllPreviousYears = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> PortfolioTransfer.mmObject();
			componentContext_lazy = () -> PreviousYearChoice.mmObject();
			isDerived = false;
			xmlTag = "AllPrvsYrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllPreviousYears";
			definition = "Selection ot the entirety of the investment plans.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PreviousAll.mmObject();
		}
	};
	protected List<ISOYear> specificPreviousYears;
	/**
	 * Selection of investment plans issued during previous years.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISOYear
	 * ISOYear}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmTransferredYear
	 * PortfolioTransfer.mmTransferredYear}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PreviousYearChoice
	 * PreviousYearChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SpcfcPrvsYrs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecificPreviousYears"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Selection of investment plans issued during previous years."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSpecificPreviousYears = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PortfolioTransfer.mmTransferredYear;
			componentContext_lazy = () -> PreviousYearChoice.mmObject();
			isDerived = false;
			xmlTag = "SpcfcPrvsYrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecificPreviousYears";
			definition = "Selection of investment plans issued during previous years.";
			minOccurs = 1;
			simpleType_lazy = () -> ISOYear.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PreviousYearChoice.mmAllPreviousYears, PreviousYearChoice.mmSpecificPreviousYears);
				trace_lazy = () -> PortfolioTransfer.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PreviousYearChoice";
				definition = "Choice between selected investment plans issued during previous years or the entirety of the investment plans.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "AllPrvsYrs", required = true)
	public PreviousAll getAllPreviousYears() {
		return allPreviousYears;
	}

	public void setAllPreviousYears(PreviousAll allPreviousYears) {
		this.allPreviousYears = allPreviousYears;
	}

	@XmlElement(name = "SpcfcPrvsYrs", required = true)
	public List<ISOYear> getSpecificPreviousYears() {
		return specificPreviousYears;
	}

	public void setSpecificPreviousYears(List<ISOYear> specificPreviousYears) {
		this.specificPreviousYears = specificPreviousYears;
	}
}