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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.OrderConfirmationStatus1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the current status of an order confirmation or of an order
 * confirmation amendment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderConfirmationStatus1Code#SentToNextParty
 * OrderConfirmationStatus1Code.SentToNextParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderConfirmationStatus1Code#CommunicationProblemNextParty
 * OrderConfirmationStatus1Code.CommunicationProblemNextParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderConfirmationStatus1Code#ConfirmationAccepted
 * OrderConfirmationStatus1Code.ConfirmationAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderConfirmationStatus1Code#ConfirmationReceived
 * OrderConfirmationStatus1Code.ConfirmationReceived}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.OrderConfirmationStatusCode
 * OrderConfirmationStatusCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"STNP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OrderConfirmationStatus1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the current status of an order confirmation or of an order confirmation amendment."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OrderConfirmationStatus1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderConfirmationStatus1Code
	 * OrderConfirmationStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SentToNextParty"</li>
	 * </ul>
	 */
	public static final OrderConfirmationStatus1Code SentToNextParty = new OrderConfirmationStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SentToNextParty";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderConfirmationStatus1Code.mmObject();
			codeName = OrderConfirmationStatusCode.SentToNextParty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderConfirmationStatus1Code
	 * OrderConfirmationStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommunicationProblemNextParty"</li>
	 * </ul>
	 */
	public static final OrderConfirmationStatus1Code CommunicationProblemNextParty = new OrderConfirmationStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommunicationProblemNextParty";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderConfirmationStatus1Code.mmObject();
			codeName = OrderConfirmationStatusCode.CommunicationProblemNextParty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderConfirmationStatus1Code
	 * OrderConfirmationStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationAccepted"</li>
	 * </ul>
	 */
	public static final OrderConfirmationStatus1Code ConfirmationAccepted = new OrderConfirmationStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationAccepted";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderConfirmationStatus1Code.mmObject();
			codeName = OrderConfirmationStatusCode.ConfirmationAccepted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderConfirmationStatus1Code
	 * OrderConfirmationStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationReceived"</li>
	 * </ul>
	 */
	public static final OrderConfirmationStatus1Code ConfirmationReceived = new OrderConfirmationStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationReceived";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderConfirmationStatus1Code.mmObject();
			codeName = OrderConfirmationStatusCode.ConfirmationReceived.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, OrderConfirmationStatus1Code> codesByName = new LinkedHashMap<>();

	protected OrderConfirmationStatus1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("STNP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OrderConfirmationStatus1Code";
				definition = "Specifies the current status of an order confirmation or of an order confirmation amendment.";
				trace_lazy = () -> OrderConfirmationStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OrderConfirmationStatus1Code.SentToNextParty, com.tools20022.repository.codeset.OrderConfirmationStatus1Code.CommunicationProblemNextParty,
						com.tools20022.repository.codeset.OrderConfirmationStatus1Code.ConfirmationAccepted, com.tools20022.repository.codeset.OrderConfirmationStatus1Code.ConfirmationReceived);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SentToNextParty.getCodeName().get(), SentToNextParty);
		codesByName.put(CommunicationProblemNextParty.getCodeName().get(), CommunicationProblemNextParty);
		codesByName.put(ConfirmationAccepted.getCodeName().get(), ConfirmationAccepted);
		codesByName.put(ConfirmationReceived.getCodeName().get(), ConfirmationReceived);
	}

	public static OrderConfirmationStatus1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OrderConfirmationStatus1Code[] values() {
		OrderConfirmationStatus1Code[] values = new OrderConfirmationStatus1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OrderConfirmationStatus1Code> {
		@Override
		public OrderConfirmationStatus1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OrderConfirmationStatus1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}