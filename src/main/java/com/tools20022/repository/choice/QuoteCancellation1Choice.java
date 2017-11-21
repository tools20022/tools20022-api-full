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
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.Debt;
import com.tools20022.repository.entity.Leg;
import com.tools20022.repository.entity.Security;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.FinancialInstrumentAttributes1;
import com.tools20022.repository.msg.FinancialInstrumentStipulations;
import com.tools20022.repository.msg.InstrumentLeg2;
import com.tools20022.repository.msg.SecurityIdentification7;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between the type of quote to be cancelled. Not required when
 * cancelling all quotes.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.QuoteCancellation1Choice#mmFinancialInstrumentDetails
 * QuoteCancellation1Choice.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.QuoteCancellation1Choice#mmFinancialInstrumentAttributes
 * QuoteCancellation1Choice.mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.QuoteCancellation1Choice#mmStipulations
 * QuoteCancellation1Choice.mmStipulations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.QuoteCancellation1Choice#mmUnderlyingFinancialInstrumentDetails
 * QuoteCancellation1Choice.mmUnderlyingFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.QuoteCancellation1Choice#mmUnderlyingFinancialInstrumentAttributes
 * QuoteCancellation1Choice.mmUnderlyingFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.QuoteCancellation1Choice#mmUnderlyingStipulations
 * QuoteCancellation1Choice.mmUnderlyingStipulations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.QuoteCancellation1Choice#mmInstrumentLegGroupDetails
 * QuoteCancellation1Choice.mmInstrumentLegGroupDetails}</li>
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
 * "QuoteCancellation1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between the type of quote to be cancelled. Not required when cancelling all quotes."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "QuoteCancellation1Choice", propOrder = {"financialInstrumentDetails", "financialInstrumentAttributes", "stipulations", "underlyingFinancialInstrumentDetails", "underlyingFinancialInstrumentAttributes",
		"underlyingStipulations", "instrumentLegGroupDetails"})
public class QuoteCancellation1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected List<SecurityIdentification7> financialInstrumentDetails;
	/**
	 * Provides details related to the financial instrument whose quotes are to
	 * be cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification7
	 * SecurityIdentification7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.QuoteCancellation1Choice
	 * QuoteCancellation1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details related to the financial instrument whose quotes are to be cancelled."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrumentDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Security.mmObject();
			componentContext_lazy = () -> QuoteCancellation1Choice.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentDetails";
			definition = "Provides details related to the financial instrument whose quotes are to be cancelled.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecurityIdentification7.mmObject();
		}
	};
	protected List<FinancialInstrumentAttributes1> financialInstrumentAttributes;
	/**
	 * Provides details about the financial instrument attributes whose quotes
	 * are to be cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1
	 * FinancialInstrumentAttributes1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.QuoteCancellation1Choice
	 * QuoteCancellation1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmAttrbts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the financial instrument attributes whose quotes are to be cancelled."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrumentAttributes = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Security.mmObject();
			componentContext_lazy = () -> QuoteCancellation1Choice.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributes";
			definition = "Provides details about the financial instrument attributes whose quotes are to be cancelled.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentAttributes1.mmObject();
		}
	};
	protected List<FinancialInstrumentStipulations> stipulations;
	/**
	 * Provides details about the financial instrument stipulations whose quotes
	 * are to be cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations
	 * FinancialInstrumentStipulations}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt Debt}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.QuoteCancellation1Choice
	 * QuoteCancellation1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Stiptns"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Stipulations"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the financial instrument stipulations whose quotes are to be cancelled."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmStipulations = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Debt.mmObject();
			componentContext_lazy = () -> QuoteCancellation1Choice.mmObject();
			isDerived = false;
			xmlTag = "Stiptns";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Stipulations";
			definition = "Provides details about the financial instrument stipulations whose quotes are to be cancelled.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentStipulations.mmObject();
		}
	};
	protected List<SecurityIdentification7> underlyingFinancialInstrumentDetails;
	/**
	 * Provides details related to the underlying financial instrument whose
	 * quotes are to be cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification7
	 * SecurityIdentification7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.QuoteCancellation1Choice
	 * QuoteCancellation1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygFinInstrmDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingFinancialInstrumentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details related to the underlying financial instrument whose quotes are to be cancelled."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUnderlyingFinancialInstrumentDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Security.mmObject();
			componentContext_lazy = () -> QuoteCancellation1Choice.mmObject();
			isDerived = false;
			xmlTag = "UndrlygFinInstrmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingFinancialInstrumentDetails";
			definition = "Provides details related to the underlying financial instrument whose quotes are to be cancelled.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecurityIdentification7.mmObject();
		}
	};
	protected List<FinancialInstrumentAttributes1> underlyingFinancialInstrumentAttributes;
	/**
	 * Provides details about the underlying financial instrument attributes
	 * whose quotes are to be cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1
	 * FinancialInstrumentAttributes1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.QuoteCancellation1Choice
	 * QuoteCancellation1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygFinInstrmAttrbts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingFinancialInstrumentAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the underlying financial instrument attributes whose quotes are to be cancelled."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUnderlyingFinancialInstrumentAttributes = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Security.mmObject();
			componentContext_lazy = () -> QuoteCancellation1Choice.mmObject();
			isDerived = false;
			xmlTag = "UndrlygFinInstrmAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingFinancialInstrumentAttributes";
			definition = "Provides details about the underlying financial instrument attributes whose quotes are to be cancelled.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentAttributes1.mmObject();
		}
	};
	protected List<FinancialInstrumentStipulations> underlyingStipulations;
	/**
	 * Provides details about the underlying financial instrument stipulations
	 * whose quotes are to be cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations
	 * FinancialInstrumentStipulations}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt Debt}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.QuoteCancellation1Choice
	 * QuoteCancellation1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygStiptns"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingStipulations"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the underlying financial instrument stipulations whose quotes are to be cancelled."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUnderlyingStipulations = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Debt.mmObject();
			componentContext_lazy = () -> QuoteCancellation1Choice.mmObject();
			isDerived = false;
			xmlTag = "UndrlygStiptns";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingStipulations";
			definition = "Provides details about the underlying financial instrument stipulations whose quotes are to be cancelled.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentStipulations.mmObject();
		}
	};
	protected List<InstrumentLeg2> instrumentLegGroupDetails;
	/**
	 * Provides details about each intrument leg whose quotes are to be
	 * canceled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InstrumentLeg2
	 * InstrumentLeg2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Leg Leg}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.QuoteCancellation1Choice
	 * QuoteCancellation1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrmLegGrpDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstrumentLegGroupDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about each intrument leg whose quotes are to be canceled."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInstrumentLegGroupDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Leg.mmObject();
			componentContext_lazy = () -> QuoteCancellation1Choice.mmObject();
			isDerived = false;
			xmlTag = "InstrmLegGrpDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstrumentLegGroupDetails";
			definition = "Provides details about each intrument leg whose quotes are to be canceled.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InstrumentLeg2.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(QuoteCancellation1Choice.mmFinancialInstrumentDetails, QuoteCancellation1Choice.mmFinancialInstrumentAttributes, QuoteCancellation1Choice.mmStipulations,
						QuoteCancellation1Choice.mmUnderlyingFinancialInstrumentDetails, QuoteCancellation1Choice.mmUnderlyingFinancialInstrumentAttributes, QuoteCancellation1Choice.mmUnderlyingStipulations,
						QuoteCancellation1Choice.mmInstrumentLegGroupDetails);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "QuoteCancellation1Choice";
				definition = "Choice between the type of quote to be cancelled. Not required when cancelling all quotes.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "FinInstrmDtls")
	public List<SecurityIdentification7> getFinancialInstrumentDetails() {
		return financialInstrumentDetails;
	}

	public void setFinancialInstrumentDetails(List<SecurityIdentification7> financialInstrumentDetails) {
		this.financialInstrumentDetails = financialInstrumentDetails;
	}

	@XmlElement(name = "FinInstrmAttrbts")
	public List<FinancialInstrumentAttributes1> getFinancialInstrumentAttributes() {
		return financialInstrumentAttributes;
	}

	public void setFinancialInstrumentAttributes(List<FinancialInstrumentAttributes1> financialInstrumentAttributes) {
		this.financialInstrumentAttributes = financialInstrumentAttributes;
	}

	@XmlElement(name = "Stiptns")
	public List<FinancialInstrumentStipulations> getStipulations() {
		return stipulations;
	}

	public void setStipulations(List<FinancialInstrumentStipulations> stipulations) {
		this.stipulations = stipulations;
	}

	@XmlElement(name = "UndrlygFinInstrmDtls")
	public List<SecurityIdentification7> getUnderlyingFinancialInstrumentDetails() {
		return underlyingFinancialInstrumentDetails;
	}

	public void setUnderlyingFinancialInstrumentDetails(List<SecurityIdentification7> underlyingFinancialInstrumentDetails) {
		this.underlyingFinancialInstrumentDetails = underlyingFinancialInstrumentDetails;
	}

	@XmlElement(name = "UndrlygFinInstrmAttrbts")
	public List<FinancialInstrumentAttributes1> getUnderlyingFinancialInstrumentAttributes() {
		return underlyingFinancialInstrumentAttributes;
	}

	public void setUnderlyingFinancialInstrumentAttributes(List<FinancialInstrumentAttributes1> underlyingFinancialInstrumentAttributes) {
		this.underlyingFinancialInstrumentAttributes = underlyingFinancialInstrumentAttributes;
	}

	@XmlElement(name = "UndrlygStiptns")
	public List<FinancialInstrumentStipulations> getUnderlyingStipulations() {
		return underlyingStipulations;
	}

	public void setUnderlyingStipulations(List<FinancialInstrumentStipulations> underlyingStipulations) {
		this.underlyingStipulations = underlyingStipulations;
	}

	@XmlElement(name = "InstrmLegGrpDtls")
	public List<InstrumentLeg2> getInstrumentLegGroupDetails() {
		return instrumentLegGroupDetails;
	}

	public void setInstrumentLegGroupDetails(List<InstrumentLeg2> instrumentLegGroupDetails) {
		this.instrumentLegGroupDetails = instrumentLegGroupDetails;
	}
}