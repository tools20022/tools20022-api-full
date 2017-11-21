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
import com.tools20022.repository.entity.Asset;
import com.tools20022.repository.entity.SecuritiesFinancing;
import com.tools20022.repository.entity.SecuritiesTrade;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.FutureOrOptionDetails1;
import com.tools20022.repository.msg.SecuritiesFinancing10;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the choice of the two leg transaction type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TwoLegTransactionType1Choice#mmFutureOrOptionDetails
 * TwoLegTransactionType1Choice.mmFutureOrOptionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TwoLegTransactionType1Choice#mmSecuritiesFinancingDetails
 * TwoLegTransactionType1Choice.mmSecuritiesFinancingDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesTrade
 * SecuritiesTrade}</li>
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
 * "TwoLegTransactionType1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the choice of the two leg transaction type."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "TwoLegTransactionType1Choice", propOrder = {"futureOrOptionDetails", "securitiesFinancingDetails"})
public class TwoLegTransactionType1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected FutureOrOptionDetails1 futureOrOptionDetails;
	/**
	 * Parameters for contracts which obligate the buyer to receive and the
	 * seller to deliver in the future the assets specified at an agreed price
	 * or contracts which grant to the holder either the privilege to purchase
	 * or the privilege to sell the assets specified at a predetermined price or
	 * formula at or within a time in the future.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1
	 * FutureOrOptionDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmDerivative
	 * Asset.mmDerivative}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TwoLegTransactionType1Choice
	 * TwoLegTransactionType1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FutrOrOptnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FutureOrOptionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parameters for contracts which obligate the buyer to receive and the seller to deliver in the future the assets specified at an agreed price or contracts which grant to the holder either the privilege to purchase or the privilege to sell the assets specified at a predetermined price or formula at or within a time in the future."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFutureOrOptionDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Asset.mmDerivative;
			componentContext_lazy = () -> TwoLegTransactionType1Choice.mmObject();
			isDerived = false;
			xmlTag = "FutrOrOptnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FutureOrOptionDetails";
			definition = "Parameters for contracts which obligate the buyer to receive and the seller to deliver in the future the assets specified at an agreed price or contracts which grant to the holder either the privilege to purchase or the privilege to sell the assets specified at a predetermined price or formula at or within a time in the future.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FutureOrOptionDetails1.mmObject();
		}
	};
	protected SecuritiesFinancing10 securitiesFinancingDetails;
	/**
	 * Provides details about the two leg transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10
	 * SecuritiesFinancing10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TwoLegTransactionType1Choice
	 * TwoLegTransactionType1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesFincgDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesFinancingDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details about the two leg transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecuritiesFinancingDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesFinancing.mmObject();
			componentContext_lazy = () -> TwoLegTransactionType1Choice.mmObject();
			isDerived = false;
			xmlTag = "SctiesFincgDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesFinancingDetails";
			definition = "Provides details about the two leg transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecuritiesFinancing10.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(TwoLegTransactionType1Choice.mmFutureOrOptionDetails, TwoLegTransactionType1Choice.mmSecuritiesFinancingDetails);
				trace_lazy = () -> SecuritiesTrade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TwoLegTransactionType1Choice";
				definition = "Specifies the choice of the two leg transaction type.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "FutrOrOptnDtls", required = true)
	public FutureOrOptionDetails1 getFutureOrOptionDetails() {
		return futureOrOptionDetails;
	}

	public void setFutureOrOptionDetails(FutureOrOptionDetails1 futureOrOptionDetails) {
		this.futureOrOptionDetails = futureOrOptionDetails;
	}

	@XmlElement(name = "SctiesFincgDtls", required = true)
	public SecuritiesFinancing10 getSecuritiesFinancingDetails() {
		return securitiesFinancingDetails;
	}

	public void setSecuritiesFinancingDetails(SecuritiesFinancing10 securitiesFinancingDetails) {
		this.securitiesFinancingDetails = securitiesFinancingDetails;
	}
}