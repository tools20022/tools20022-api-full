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
import com.tools20022.repository.codeset.TransactionIndividualStatus3Code;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.Max15NumericText;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of elements used to provide detailed information on the number of
 * transactions that are reported with a specific transaction status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NumberOfTransactionsPerStatus3#DetailedNumberOfTransactions
 * NumberOfTransactionsPerStatus3.DetailedNumberOfTransactions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NumberOfTransactionsPerStatus3#DetailedStatus
 * NumberOfTransactionsPerStatus3.DetailedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NumberOfTransactionsPerStatus3#DetailedControlSum
 * NumberOfTransactionsPerStatus3.DetailedControlSum}</li>
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
 * "NumberOfTransactionsPerStatus3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements used to provide detailed information on the number of transactions that are reported with a specific transaction status."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.NumberOfItemsPerStatus1
 * NumberOfItemsPerStatus1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NumberOfTransactionsPerStatus5
 * NumberOfTransactionsPerStatus5}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class NumberOfTransactionsPerStatus3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Number of individual transactions contained in the message, detailed per
	 * status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15NumericText
	 * Max15NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NumberOfTransactionsPerStatus3
	 * NumberOfTransactionsPerStatus3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtldNbOfTxs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DetailedNumberOfTransactions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of individual transactions contained in the message, detailed per status."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NumberOfItemsPerStatus1#NumberOfItems
	 * NumberOfItemsPerStatus1.NumberOfItems}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NumberOfTransactionsPerStatus5#DetailedNumberOfTransactions
	 * NumberOfTransactionsPerStatus5.DetailedNumberOfTransactions}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute DetailedNumberOfTransactions = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NumberOfTransactionsPerStatus3.mmObject();
			isDerived = false;
			xmlTag = "DtldNbOfTxs";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DetailedNumberOfTransactions";
			definition = "Number of individual transactions contained in the message, detailed per status.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.NumberOfItemsPerStatus1.NumberOfItems, com.tools20022.repository.msg.NumberOfTransactionsPerStatus5.DetailedNumberOfTransactions);
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}
	};
	/**
	 * Common transaction status for all individual transactions reported.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionIndividualStatus3Code
	 * TransactionIndividualStatus3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NumberOfTransactionsPerStatus3
	 * NumberOfTransactionsPerStatus3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtldSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DetailedStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Common transaction status for all individual transactions reported."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NumberOfItemsPerStatus1#Status
	 * NumberOfItemsPerStatus1.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NumberOfTransactionsPerStatus5#DetailedStatus
	 * NumberOfTransactionsPerStatus5.DetailedStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute DetailedStatus = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NumberOfTransactionsPerStatus3.mmObject();
			isDerived = false;
			xmlTag = "DtldSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DetailedStatus";
			definition = "Common transaction status for all individual transactions reported.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.NumberOfItemsPerStatus1.Status, com.tools20022.repository.msg.NumberOfTransactionsPerStatus5.DetailedStatus);
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TransactionIndividualStatus3Code.mmObject();
		}
	};
	/**
	 * Total of all individual amounts included in the message, irrespective of
	 * currencies, detailed per status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NumberOfTransactionsPerStatus3
	 * NumberOfTransactionsPerStatus3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtldCtrlSum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DetailedControlSum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total of all individual amounts included in the message, irrespective of currencies, detailed per status."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NumberOfTransactionsPerStatus5#DetailedControlSum
	 * NumberOfTransactionsPerStatus5.DetailedControlSum}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute DetailedControlSum = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NumberOfTransactionsPerStatus3.mmObject();
			isDerived = false;
			xmlTag = "DtldCtrlSum";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DetailedControlSum";
			definition = "Total of all individual amounts included in the message, irrespective of currencies, detailed per status.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.NumberOfTransactionsPerStatus5.DetailedControlSum);
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.NumberOfTransactionsPerStatus3.DetailedNumberOfTransactions, com.tools20022.repository.msg.NumberOfTransactionsPerStatus3.DetailedStatus,
						com.tools20022.repository.msg.NumberOfTransactionsPerStatus3.DetailedControlSum);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "NumberOfTransactionsPerStatus3";
				definition = "Set of elements used to provide detailed information on the number of transactions that are reported with a specific transaction status.";
				nextVersions_lazy = () -> Arrays.asList(NumberOfItemsPerStatus1.mmObject(), NumberOfTransactionsPerStatus5.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}