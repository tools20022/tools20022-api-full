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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.DateFormat31Choice;
import com.tools20022.repository.choice.PartyIdentification92Choice;
import com.tools20022.repository.entity.CorporateActionDeadline;
import com.tools20022.repository.entity.CorporateActionPartyRole;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Stock lending deadline assigned to a borrower of the stock.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BorrowerLendingDeadline1#mmStockLendingDeadline
 * BorrowerLendingDeadline1.mmStockLendingDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BorrowerLendingDeadline1#mmBorrower
 * BorrowerLendingDeadline1.mmBorrower}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline
 * CorporateActionDeadline}</li>
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
 * "BorrowerLendingDeadline1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Stock lending deadline assigned to a borrower of the stock."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "BorrowerLendingDeadline1", propOrder = {"stockLendingDeadline", "borrower"})
public class BorrowerLendingDeadline1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected DateFormat31Choice stockLendingDeadline;
	/**
	 * Date/time set as the deadline to respond, with instructions, to an
	 * outstanding event, for which the underlying security is out on loan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat31Choice
	 * DateFormat31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmStockLendingDeadline
	 * CorporateActionDeadline.mmStockLendingDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BorrowerLendingDeadline1
	 * BorrowerLendingDeadline1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StockLndgDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockLendingDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time set as the deadline to respond, with instructions, to an outstanding event, for which the underlying security is out on loan."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmStockLendingDeadline = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmStockLendingDeadline;
			componentContext_lazy = () -> BorrowerLendingDeadline1.mmObject();
			isDerived = false;
			xmlTag = "StockLndgDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockLendingDeadline";
			definition = "Date/time set as the deadline to respond, with instructions, to an outstanding event, for which the underlying security is out on loan.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DateFormat31Choice.mmObject();
		}
	};
	protected PartyIdentification92Choice borrower;
	/**
	 * Party who has borrowed stocks on loan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification92Choice
	 * PartyIdentification92Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPartyRole
	 * CorporateActionPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BorrowerLendingDeadline1
	 * BorrowerLendingDeadline1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Brrwr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Borrower"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party who has borrowed stocks on loan."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBorrower = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CorporateActionPartyRole.mmObject();
			componentContext_lazy = () -> BorrowerLendingDeadline1.mmObject();
			isDerived = false;
			xmlTag = "Brrwr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Borrower";
			definition = "Party who has borrowed stocks on loan.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification92Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(BorrowerLendingDeadline1.mmStockLendingDeadline, BorrowerLendingDeadline1.mmBorrower);
				trace_lazy = () -> CorporateActionDeadline.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BorrowerLendingDeadline1";
				definition = "Stock lending deadline assigned to a borrower of the stock.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "StockLndgDdln", required = true)
	public DateFormat31Choice getStockLendingDeadline() {
		return stockLendingDeadline;
	}

	public void setStockLendingDeadline(DateFormat31Choice stockLendingDeadline) {
		this.stockLendingDeadline = stockLendingDeadline;
	}

	@XmlElement(name = "Brrwr", required = true)
	public PartyIdentification92Choice getBorrower() {
		return borrower;
	}

	public void setBorrower(PartyIdentification92Choice borrower) {
		this.borrower = borrower;
	}
}