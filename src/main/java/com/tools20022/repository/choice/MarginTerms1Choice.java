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
import com.tools20022.repository.entity.ExposureTerm;
import com.tools20022.repository.entity.IndependentAmountTerm;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Margin1;
import com.tools20022.repository.msg.SegregatedIndependentAmountMargin1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides the margin terms for the variation margin and the segregated
 * independent amount, or the segregated independent amount only.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MarginTerms1Choice#mmMarginDetails
 * MarginTerms1Choice.mmMarginDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MarginTerms1Choice#mmSegregatedIndependentAmountMargin
 * MarginTerms1Choice.mmSegregatedIndependentAmountMargin}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ExposureTerm
 * ExposureTerm}</li>
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
 * "MarginTerms1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the margin terms for the variation margin and the segregated independent amount, or the segregated independent amount only."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "MarginTerms1Choice", propOrder = {"marginDetails", "segregatedIndependentAmountMargin"})
public class MarginTerms1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected Margin1 marginDetails;
	/**
	 * Elements used to calculate the collateral margin call for the variation
	 * margin and optionally the segregated independent amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Margin1 Margin1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ExposureTerm ExposureTerm}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.MarginTerms1Choice
	 * MarginTerms1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrgnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Elements used to calculate the collateral margin call for the variation margin and optionally the segregated independent amount."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMarginDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> ExposureTerm.mmObject();
			componentContext_lazy = () -> MarginTerms1Choice.mmObject();
			isDerived = false;
			xmlTag = "MrgnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginDetails";
			definition = "Elements used to calculate the collateral margin call for the variation margin and optionally the segregated independent amount.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Margin1.mmObject();
		}
	};
	protected SegregatedIndependentAmountMargin1 segregatedIndependentAmountMargin;
	/**
	 * Elements used to calculate the collateral margin call for the segregated
	 * independent amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SegregatedIndependentAmountMargin1
	 * SegregatedIndependentAmountMargin1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.IndependentAmountTerm
	 * IndependentAmountTerm}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.MarginTerms1Choice
	 * MarginTerms1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SgrtdIndpdntAmtMrgn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SegregatedIndependentAmountMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Elements used to calculate the collateral margin call for the segregated independent amount."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSegregatedIndependentAmountMargin = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> IndependentAmountTerm.mmObject();
			componentContext_lazy = () -> MarginTerms1Choice.mmObject();
			isDerived = false;
			xmlTag = "SgrtdIndpdntAmtMrgn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SegregatedIndependentAmountMargin";
			definition = "Elements used to calculate the collateral margin call for the segregated independent amount.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SegregatedIndependentAmountMargin1.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(MarginTerms1Choice.mmMarginDetails, MarginTerms1Choice.mmSegregatedIndependentAmountMargin);
				trace_lazy = () -> ExposureTerm.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MarginTerms1Choice";
				definition = "Provides the margin terms for the variation margin and the segregated independent amount, or the segregated independent amount only.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "MrgnDtls", required = true)
	public Margin1 getMarginDetails() {
		return marginDetails;
	}

	public void setMarginDetails(Margin1 marginDetails) {
		this.marginDetails = marginDetails;
	}

	@XmlElement(name = "SgrtdIndpdntAmtMrgn", required = true)
	public SegregatedIndependentAmountMargin1 getSegregatedIndependentAmountMargin() {
		return segregatedIndependentAmountMargin;
	}

	public void setSegregatedIndependentAmountMargin(SegregatedIndependentAmountMargin1 segregatedIndependentAmountMargin) {
		this.segregatedIndependentAmountMargin = segregatedIndependentAmountMargin;
	}
}