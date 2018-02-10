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
import com.tools20022.repository.codeset.SettlementStatus1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.SettlementStatus1Code#AwaitingAuthorisation
 * SettlementStatus1Code.AwaitingAuthorisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementStatus1Code#AcceptedForSettlement
 * SettlementStatus1Code.AcceptedForSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementStatus1Code#SettlementTransactionCreated
 * SettlementStatus1Code.SettlementTransactionCreated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementStatus1Code#Rejected
 * SettlementStatus1Code.Rejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementStatus1Code#Split
 * SettlementStatus1Code.Split}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementStatus1Code#PartiallySettled
 * SettlementStatus1Code.PartiallySettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementStatus1Code#Settled
 * SettlementStatus1Code.Settled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementStatus1Code#AwaitingCreationConfirmation
 * SettlementStatus1Code.AwaitingCreationConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementStatus1Code#AwaitingRescindConfirmation
 * SettlementStatus1Code.AwaitingRescindConfirmation}</li>
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
 * "SettlementStatus1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the status of the settlement of a trade in a central matching and settlement system."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SettlementStatus1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementStatus1Code
	 * SettlementStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingAuthorisation"</li>
	 * </ul>
	 */
	public static final SettlementStatus1Code AwaitingAuthorisation = new SettlementStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingAuthorisation";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementStatus1Code.mmObject();
			codeName = SettlementStatusCode.AwaitingAuthorisation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementStatus1Code
	 * SettlementStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedForSettlement"</li>
	 * </ul>
	 */
	public static final SettlementStatus1Code AcceptedForSettlement = new SettlementStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedForSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementStatus1Code.mmObject();
			codeName = SettlementStatusCode.AcceptedForSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementStatus1Code
	 * SettlementStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementTransactionCreated"</li>
	 * </ul>
	 */
	public static final SettlementStatus1Code SettlementTransactionCreated = new SettlementStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTransactionCreated";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementStatus1Code.mmObject();
			codeName = SettlementStatusCode.SettlementTransactionCreated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementStatus1Code
	 * SettlementStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * </ul>
	 */
	public static final SettlementStatus1Code Rejected = new SettlementStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementStatus1Code.mmObject();
			codeName = SettlementStatusCode.Rejected.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementStatus1Code
	 * SettlementStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Split"</li>
	 * </ul>
	 */
	public static final SettlementStatus1Code Split = new SettlementStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Split";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementStatus1Code.mmObject();
			codeName = SettlementStatusCode.Split.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementStatus1Code
	 * SettlementStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartiallySettled"</li>
	 * </ul>
	 */
	public static final SettlementStatus1Code PartiallySettled = new SettlementStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartiallySettled";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementStatus1Code.mmObject();
			codeName = SettlementStatusCode.PartiallySettled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementStatus1Code
	 * SettlementStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Settled"</li>
	 * </ul>
	 */
	public static final SettlementStatus1Code Settled = new SettlementStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Settled";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementStatus1Code.mmObject();
			codeName = SettlementStatusCode.Settled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementStatus1Code
	 * SettlementStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingCreationConfirmation"</li>
	 * </ul>
	 */
	public static final SettlementStatus1Code AwaitingCreationConfirmation = new SettlementStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingCreationConfirmation";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementStatus1Code.mmObject();
			codeName = SettlementStatusCode.AwaitingCreationConfirmation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementStatus1Code
	 * SettlementStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingRescindConfirmation"</li>
	 * </ul>
	 */
	public static final SettlementStatus1Code AwaitingRescindConfirmation = new SettlementStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingRescindConfirmation";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementStatus1Code.mmObject();
			codeName = SettlementStatusCode.AwaitingRescindConfirmation.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SettlementStatus1Code> codesByName = new LinkedHashMap<>();

	protected SettlementStatus1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AAUT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementStatus1Code";
				definition = "Specifies the status of the settlement of a trade in a central matching and settlement system.";
				trace_lazy = () -> SettlementStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettlementStatus1Code.AwaitingAuthorisation, com.tools20022.repository.codeset.SettlementStatus1Code.AcceptedForSettlement,
						com.tools20022.repository.codeset.SettlementStatus1Code.SettlementTransactionCreated, com.tools20022.repository.codeset.SettlementStatus1Code.Rejected, com.tools20022.repository.codeset.SettlementStatus1Code.Split,
						com.tools20022.repository.codeset.SettlementStatus1Code.PartiallySettled, com.tools20022.repository.codeset.SettlementStatus1Code.Settled,
						com.tools20022.repository.codeset.SettlementStatus1Code.AwaitingCreationConfirmation, com.tools20022.repository.codeset.SettlementStatus1Code.AwaitingRescindConfirmation);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AwaitingAuthorisation.getCodeName().get(), AwaitingAuthorisation);
		codesByName.put(AcceptedForSettlement.getCodeName().get(), AcceptedForSettlement);
		codesByName.put(SettlementTransactionCreated.getCodeName().get(), SettlementTransactionCreated);
		codesByName.put(Rejected.getCodeName().get(), Rejected);
		codesByName.put(Split.getCodeName().get(), Split);
		codesByName.put(PartiallySettled.getCodeName().get(), PartiallySettled);
		codesByName.put(Settled.getCodeName().get(), Settled);
		codesByName.put(AwaitingCreationConfirmation.getCodeName().get(), AwaitingCreationConfirmation);
		codesByName.put(AwaitingRescindConfirmation.getCodeName().get(), AwaitingRescindConfirmation);
	}

	public static SettlementStatus1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SettlementStatus1Code[] values() {
		SettlementStatus1Code[] values = new SettlementStatus1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SettlementStatus1Code> {
		@Override
		public SettlementStatus1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SettlementStatus1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}