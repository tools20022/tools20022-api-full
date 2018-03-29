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

import com.tools20022.metamodel.ext.DTCCSynonym;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SignedQuantityFormat4;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.choice.AdjustedBalanceTypeSD2Choice#mmStockLoan
 * AdjustedBalanceTypeSD2Choice.mmStockLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AdjustedBalanceTypeSD2Choice#mmRepo
 * AdjustedBalanceTypeSD2Choice.mmRepo}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AdjustedBalanceTypeSD2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of balance types to provide transaction details."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.AdjustedBalanceTypeSD1Choice
 * AdjustedBalanceTypeSD1Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AdjustedBalanceTypeSD2Choice", propOrder = {"stockLoan", "repo"})
public class AdjustedBalanceTypeSD2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "StockLn", required = true)
	protected SignedQuantityFormat4 stockLoan;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.AdjustedBalanceTypeSD2Choice
	 * AdjustedBalanceTypeSD2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StockLn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Stock Loan</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute<AdjustedBalanceTypeSD2Choice, SignedQuantityFormat4> mmStockLoan = new MMMessageAttribute<AdjustedBalanceTypeSD2Choice, SignedQuantityFormat4>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.AdjustedBalanceTypeSD2Choice.mmObject();
			isDerived = false;
			xmlTag = "StockLn";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Stock Loan"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockLoan";
			definition = "Stock loan transaction position. Stock loan is loaned / borrowed from / to a third party.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SignedQuantityFormat4.mmObject();
		}

		@Override
		public SignedQuantityFormat4 getValue(AdjustedBalanceTypeSD2Choice obj) {
			return obj.getStockLoan();
		}

		@Override
		public void setValue(AdjustedBalanceTypeSD2Choice obj, SignedQuantityFormat4 value) {
			obj.setStockLoan(value);
		}
	};
	@XmlElement(name = "Repo", required = true)
	protected SignedQuantityFormat4 repo;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.AdjustedBalanceTypeSD2Choice
	 * AdjustedBalanceTypeSD2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Repo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: REPO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Repo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Repurchase agreement (REPO) between a seller and a buyer whereby the seller agrees to repurchase the securities at an agreed upon price, and usually at a stated time."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AdjustedBalanceTypeSD2Choice, SignedQuantityFormat4> mmRepo = new MMMessageAttribute<AdjustedBalanceTypeSD2Choice, SignedQuantityFormat4>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.AdjustedBalanceTypeSD2Choice.mmObject();
			isDerived = false;
			xmlTag = "Repo";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "REPO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Repo";
			definition = "Repurchase agreement (REPO) between a seller and a buyer whereby the seller agrees to repurchase the securities at an agreed upon price, and usually at a stated time.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SignedQuantityFormat4.mmObject();
		}

		@Override
		public SignedQuantityFormat4 getValue(AdjustedBalanceTypeSD2Choice obj) {
			return obj.getRepo();
		}

		@Override
		public void setValue(AdjustedBalanceTypeSD2Choice obj, SignedQuantityFormat4 value) {
			obj.setRepo(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AdjustedBalanceTypeSD2Choice.mmStockLoan, com.tools20022.repository.choice.AdjustedBalanceTypeSD2Choice.mmRepo);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "AdjustedBalanceTypeSD2Choice";
				definition = "Choice of balance types to provide transaction details.";
				previousVersion_lazy = () -> AdjustedBalanceTypeSD1Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public SignedQuantityFormat4 getStockLoan() {
		return stockLoan;
	}

	public AdjustedBalanceTypeSD2Choice setStockLoan(SignedQuantityFormat4 stockLoan) {
		this.stockLoan = Objects.requireNonNull(stockLoan);
		return this;
	}

	public SignedQuantityFormat4 getRepo() {
		return repo;
	}

	public AdjustedBalanceTypeSD2Choice setRepo(SignedQuantityFormat4 repo) {
		this.repo = Objects.requireNonNull(repo);
		return this;
	}
}