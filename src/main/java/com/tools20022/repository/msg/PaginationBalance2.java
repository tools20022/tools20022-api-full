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
import com.tools20022.repository.choice.ClosingBalance3Choice;
import com.tools20022.repository.choice.OpeningBalance3Choice;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Balance of a financial instrument for a specific statement page.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaginationBalance2#OpeningBalance
 * PaginationBalance2.OpeningBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaginationBalance2#ClosingBalance
 * PaginationBalance2.ClosingBalance}</li>
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
 * "PaginationBalance2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Balance of a financial instrument for a specific statement page."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.PaginationBalance1
 * PaginationBalance1}</li>
 * </ul>
 */
public class PaginationBalance2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Opening balance of the financial instrument in the statement or of the
	 * intermediary opening balance of the page of the statement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.OpeningBalance3Choice
	 * OpeningBalance3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaginationBalance2
	 * PaginationBalance2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OpngBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Opening balance of the financial instrument in the statement or of the intermediary opening balance of the page of the statement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd OpeningBalance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PaginationBalance2.mmObject();
			isDerived = false;
			xmlTag = "OpngBal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningBalance";
			definition = "Opening balance of the financial instrument in the statement or of the intermediary opening balance of the page of the statement.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> OpeningBalance3Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Closing balance of the financial instrument in the statement or of the
	 * intermediary closing balance of the page of the statement
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ClosingBalance3Choice
	 * ClosingBalance3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaginationBalance2
	 * PaginationBalance2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClsgBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Closing balance of the financial instrument in the statement or of the intermediary closing balance of the page of the statement"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ClosingBalance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PaginationBalance2.mmObject();
			isDerived = false;
			xmlTag = "ClsgBal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingBalance";
			definition = "Closing balance of the financial instrument in the statement or of the intermediary closing balance of the page of the statement";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ClosingBalance3Choice.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaginationBalance2.OpeningBalance, com.tools20022.repository.msg.PaginationBalance2.ClosingBalance);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaginationBalance2";
				definition = "Balance of a financial instrument for a specific statement page.";
				previousVersion_lazy = () -> PaginationBalance1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}