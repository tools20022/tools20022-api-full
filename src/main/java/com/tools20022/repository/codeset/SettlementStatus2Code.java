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
import com.tools20022.repository.codeset.SettlementStatus2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the status of the settlement of a trade in a central matching and
 * settlement system.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementStatus2Code#AwaitingAuthorisation
 * SettlementStatus2Code.AwaitingAuthorisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementStatus2Code#AcceptedForSettlement
 * SettlementStatus2Code.AcceptedForSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementStatus2Code#SettlementTransactionCreated
 * SettlementStatus2Code.SettlementTransactionCreated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementStatus2Code#Settled
 * SettlementStatus2Code.Settled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementStatus2Code#AwaitingCreationConfirmation
 * SettlementStatus2Code.AwaitingCreationConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementStatus2Code#AwaitingRescindConfirmation
 * SettlementStatus2Code.AwaitingRescindConfirmation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SettlementStatusCode
 * SettlementStatusCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"AAUT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementStatus2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the status of the settlement of a trade in a central matching and settlement system."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SettlementStatus2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementStatus2Code
	 * SettlementStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingAuthorisation"</li>
	 * </ul>
	 */
	public static final SettlementStatus2Code AwaitingAuthorisation = new SettlementStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingAuthorisation";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementStatus2Code.mmObject();
			codeName = SettlementStatusCode.AwaitingAuthorisation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementStatus2Code
	 * SettlementStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedForSettlement"</li>
	 * </ul>
	 */
	public static final SettlementStatus2Code AcceptedForSettlement = new SettlementStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedForSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementStatus2Code.mmObject();
			codeName = SettlementStatusCode.AcceptedForSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementStatus2Code
	 * SettlementStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementTransactionCreated"</li>
	 * </ul>
	 */
	public static final SettlementStatus2Code SettlementTransactionCreated = new SettlementStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTransactionCreated";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementStatus2Code.mmObject();
			codeName = SettlementStatusCode.SettlementTransactionCreated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementStatus2Code
	 * SettlementStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Settled"</li>
	 * </ul>
	 */
	public static final SettlementStatus2Code Settled = new SettlementStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Settled";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementStatus2Code.mmObject();
			codeName = SettlementStatusCode.Settled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementStatus2Code
	 * SettlementStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingCreationConfirmation"</li>
	 * </ul>
	 */
	public static final SettlementStatus2Code AwaitingCreationConfirmation = new SettlementStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingCreationConfirmation";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementStatus2Code.mmObject();
			codeName = SettlementStatusCode.AwaitingCreationConfirmation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementStatus2Code
	 * SettlementStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingRescindConfirmation"</li>
	 * </ul>
	 */
	public static final SettlementStatus2Code AwaitingRescindConfirmation = new SettlementStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingRescindConfirmation";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementStatus2Code.mmObject();
			codeName = SettlementStatusCode.AwaitingRescindConfirmation.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SettlementStatus2Code> codesByName = new LinkedHashMap<>();

	protected SettlementStatus2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AAUT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementStatus2Code";
				definition = "Specifies the status of the settlement of a trade in a central matching and settlement system.";
				trace_lazy = () -> SettlementStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettlementStatus2Code.AwaitingAuthorisation, com.tools20022.repository.codeset.SettlementStatus2Code.AcceptedForSettlement,
						com.tools20022.repository.codeset.SettlementStatus2Code.SettlementTransactionCreated, com.tools20022.repository.codeset.SettlementStatus2Code.Settled,
						com.tools20022.repository.codeset.SettlementStatus2Code.AwaitingCreationConfirmation, com.tools20022.repository.codeset.SettlementStatus2Code.AwaitingRescindConfirmation);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AwaitingAuthorisation.getCodeName().get(), AwaitingAuthorisation);
		codesByName.put(AcceptedForSettlement.getCodeName().get(), AcceptedForSettlement);
		codesByName.put(SettlementTransactionCreated.getCodeName().get(), SettlementTransactionCreated);
		codesByName.put(Settled.getCodeName().get(), Settled);
		codesByName.put(AwaitingCreationConfirmation.getCodeName().get(), AwaitingCreationConfirmation);
		codesByName.put(AwaitingRescindConfirmation.getCodeName().get(), AwaitingRescindConfirmation);
	}

	public static SettlementStatus2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SettlementStatus2Code[] values() {
		SettlementStatus2Code[] values = new SettlementStatus2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SettlementStatus2Code> {
		@Override
		public SettlementStatus2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SettlementStatus2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}