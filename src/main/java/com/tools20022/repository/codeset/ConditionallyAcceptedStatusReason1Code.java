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
import com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason for a conditionally accepted status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason1Code#AwaitingMoney
 * ConditionallyAcceptedStatusReason1Code.AwaitingMoney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason1Code#AwaitingFunds
 * ConditionallyAcceptedStatusReason1Code.AwaitingFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason1Code#AwaitingDocuments
 * ConditionallyAcceptedStatusReason1Code.AwaitingDocuments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason1Code#Other
 * ConditionallyAcceptedStatusReason1Code.Other}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReasonCode
 * ConditionallyAcceptedStatusReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"AWMO"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ConditionallyAcceptedStatusReason1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason for a conditionally accepted status."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ConditionallyAcceptedStatusReason1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies that the order is accepted for further processing but that the
	 * execution of the order is pending until there is enough cash in the
	 * account to pay the subscription.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason1Code
	 * ConditionallyAcceptedStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AWMO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingMoney"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the order is accepted for further processing but that the execution of the order is pending until there is enough cash in the account to pay the subscription."
	 * </li>
	 * </ul>
	 */
	public static final ConditionallyAcceptedStatusReason1Code AwaitingMoney = new ConditionallyAcceptedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AwaitingMoney";
			definition = "Specifies that the order is accepted for further processing but that the execution of the order is pending until there is enough cash in the account to pay the subscription.";
			owner_lazy = () -> com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason1Code.mmObject();
			codeName = "AWMO";
			codeName = ConditionallyAcceptedStatusReasonCode.AwaitingMoney.getCodeName().orElse(name);
		}
	};
	/**
	 * Specifies that the order is accepted for further processing but that the
	 * execution of the order is pending until there are enough funds in the
	 * account to complete the redemption.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason1Code
	 * ConditionallyAcceptedStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AWSH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingFunds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the order is accepted for further processing but that the execution of the order is pending until there are enough funds in the account to complete the redemption."
	 * </li>
	 * </ul>
	 */
	public static final ConditionallyAcceptedStatusReason1Code AwaitingFunds = new ConditionallyAcceptedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AwaitingFunds";
			definition = "Specifies that the order is accepted for further processing but that the execution of the order is pending until there are enough funds in the account to complete the redemption.";
			owner_lazy = () -> com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason1Code.mmObject();
			codeName = "AWSH";
			codeName = ConditionallyAcceptedStatusReasonCode.AwaitingFunds.getCodeName().orElse(name);
		}
	};
	/**
	 * Specifies that the order is pending until documents are completed and
	 * received, eg, legal documents from the successor, legal proceeds because
	 * of bankruptcy, missing signature.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason1Code
	 * ConditionallyAcceptedStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DOCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingDocuments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the order is pending until documents are completed and received, eg, legal documents from the successor, legal proceeds because of bankruptcy, missing signature."
	 * </li>
	 * </ul>
	 */
	public static final ConditionallyAcceptedStatusReason1Code AwaitingDocuments = new ConditionallyAcceptedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AwaitingDocuments";
			definition = "Specifies that the order is pending until documents are completed and received, eg, legal documents from the successor, legal proceeds because of bankruptcy, missing signature.";
			owner_lazy = () -> com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason1Code.mmObject();
			codeName = "DOCC";
			codeName = ConditionallyAcceptedStatusReasonCode.AwaitingDocuments.getCodeName().orElse(name);
		}
	};
	/**
	 * Another reason for the status conditionally accepted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason1Code
	 * ConditionallyAcceptedStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Another reason for the status conditionally accepted."</li>
	 * </ul>
	 */
	public static final ConditionallyAcceptedStatusReason1Code Other = new ConditionallyAcceptedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Another reason for the status conditionally accepted.";
			owner_lazy = () -> com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason1Code.mmObject();
			codeName = "OTHR";
			codeName = ConditionallyAcceptedStatusReasonCode.Other.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ConditionallyAcceptedStatusReason1Code> codesByName = new LinkedHashMap<>();

	protected ConditionallyAcceptedStatusReason1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AWMO");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ConditionallyAcceptedStatusReason1Code";
				definition = "Specifies the reason for a conditionally accepted status.";
				trace_lazy = () -> ConditionallyAcceptedStatusReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason1Code.AwaitingMoney, com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason1Code.AwaitingFunds,
						com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason1Code.AwaitingDocuments, com.tools20022.repository.codeset.ConditionallyAcceptedStatusReason1Code.Other);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AwaitingMoney.getCodeName().get(), AwaitingMoney);
		codesByName.put(AwaitingFunds.getCodeName().get(), AwaitingFunds);
		codesByName.put(AwaitingDocuments.getCodeName().get(), AwaitingDocuments);
		codesByName.put(Other.getCodeName().get(), Other);
	}

	public static ConditionallyAcceptedStatusReason1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ConditionallyAcceptedStatusReason1Code[] values() {
		ConditionallyAcceptedStatusReason1Code[] values = new ConditionallyAcceptedStatusReason1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ConditionallyAcceptedStatusReason1Code> {
		@Override
		public ConditionallyAcceptedStatusReason1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ConditionallyAcceptedStatusReason1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}