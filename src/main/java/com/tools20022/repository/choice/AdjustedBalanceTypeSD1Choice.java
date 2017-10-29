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
import com.tools20022.repository.msg.SignedQuantityFormat4;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Choice of balance types to provide transaction details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AdjustedBalanceTypeSD1Choice#StockLoan
 * AdjustedBalanceTypeSD1Choice.StockLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AdjustedBalanceTypeSD1Choice#Repo
 * AdjustedBalanceTypeSD1Choice.Repo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AdjustedBalanceTypeSD1Choice#Fail
 * AdjustedBalanceTypeSD1Choice.Fail}</li>
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
 * "AdjustedBalanceTypeSD1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of balance types to provide transaction details."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AdjustedBalanceTypeSD2Choice
 * AdjustedBalanceTypeSD2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AdjustedBalanceTypeSD3Choice
 * AdjustedBalanceTypeSD3Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class AdjustedBalanceTypeSD1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Stock loan transaction position. Stock loan is loaned / borrowed from /
	 * to a third party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat4
	 * SignedQuantityFormat4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AdjustedBalanceTypeSD1Choice
	 * AdjustedBalanceTypeSD1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StockLn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockLoan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Stock loan transaction position. Stock loan is loaned / borrowed from / to a third party."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdjustedBalanceTypeSD3Choice#StockLoan
	 * AdjustedBalanceTypeSD3Choice.StockLoan}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute StockLoan = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AdjustedBalanceTypeSD1Choice.mmObject();
			isDerived = false;
			xmlTag = "StockLn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockLoan";
			definition = "Stock loan transaction position. Stock loan is loaned / borrowed from / to a third party.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AdjustedBalanceTypeSD3Choice.StockLoan);
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> SignedQuantityFormat4.mmObject();
		}
	};
	/**
	 * Repurchase agreement (REPO) between a seller and a buyer whereby the
	 * seller agrees to repurchase the securities at an agreed upon price, and
	 * usually at a stated time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat4
	 * SignedQuantityFormat4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AdjustedBalanceTypeSD1Choice
	 * AdjustedBalanceTypeSD1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Repo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Repo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Repurchase agreement (REPO) between a seller and a buyer whereby the seller agrees to repurchase the securities at an agreed upon price, and usually at a stated time. "
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AdjustedBalanceTypeSD3Choice#Repo
	 * AdjustedBalanceTypeSD3Choice.Repo}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute Repo = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AdjustedBalanceTypeSD1Choice.mmObject();
			isDerived = false;
			xmlTag = "Repo";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Repo";
			definition = "Repurchase agreement (REPO) between a seller and a buyer whereby the seller agrees to repurchase the securities at an agreed upon price, and usually at a stated time. ";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AdjustedBalanceTypeSD3Choice.Repo);
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> SignedQuantityFormat4.mmObject();
		}
	};
	/**
	 * Securities undelivered (FAIL) transaction position. FAIL occurs due to
	 * the failure of selling clients to deliver the securities to their brokers
	 * so the latter can deliver them to the buying brokers.  
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat4
	 * SignedQuantityFormat4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AdjustedBalanceTypeSD1Choice
	 * AdjustedBalanceTypeSD1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Fail"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fail"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities undelivered (FAIL) transaction position.  FAIL occurs due to the failure of selling clients to deliver the securities to their brokers so the latter can deliver them to the buying brokers.  "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute Fail = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AdjustedBalanceTypeSD1Choice.mmObject();
			isDerived = false;
			xmlTag = "Fail";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fail";
			definition = "Securities undelivered (FAIL) transaction position.  FAIL occurs due to the failure of selling clients to deliver the securities to their brokers so the latter can deliver them to the buying brokers.  ";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> SignedQuantityFormat4.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AdjustedBalanceTypeSD1Choice.StockLoan, com.tools20022.repository.choice.AdjustedBalanceTypeSD1Choice.Repo,
						com.tools20022.repository.choice.AdjustedBalanceTypeSD1Choice.Fail);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AdjustedBalanceTypeSD1Choice";
				definition = "Choice of balance types to provide transaction details.";
				nextVersions_lazy = () -> Arrays.asList(AdjustedBalanceTypeSD2Choice.mmObject(), AdjustedBalanceTypeSD3Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}