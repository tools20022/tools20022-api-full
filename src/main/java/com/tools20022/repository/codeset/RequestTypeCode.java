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
import com.tools20022.repository.codeset.RequestTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the request used to further detail the type of information that
 * will be queried.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RequestTypeCode#ReleasePending
 * RequestTypeCode.ReleasePending}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RequestTypeCode#HoldNormal
 * RequestTypeCode.HoldNormal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RequestTypeCode#Cancellation
 * RequestTypeCode.Cancellation}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RequestTypeCode#ReSequence
 * RequestTypeCode.ReSequence}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RequestTypeCode#ReleaseSuspicious
 * RequestTypeCode.ReleaseSuspicious}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RequestTypeCode#BankPositionEnquiry
 * RequestTypeCode.BankPositionEnquiry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RequestTypeCode#SpecificTransactionEnquiry
 * RequestTypeCode.SpecificTransactionEnquiry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RequestTypeCode#QueuedTransactionEnquiry
 * RequestTypeCode.QueuedTransactionEnquiry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RequestTypeCode#SuspiciousTransactionEnquiry
 * RequestTypeCode.SuspiciousTransactionEnquiry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RequestTypeCode#PendingInwardCreditsEnquiry
 * RequestTypeCode.PendingInwardCreditsEnquiry}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.RequestType1Code
 * RequestType1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RequestType2Code
 * RequestType2Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"RT01"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RequestTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the request used to further detail the type of information that will be queried."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RequestTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Type is a request to release the pending transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RequestTypeCode
	 * RequestTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RT01"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReleasePending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type is a request to release the pending transactions."</li>
	 * </ul>
	 */
	public static final RequestTypeCode ReleasePending = new RequestTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReleasePending";
			definition = "Type is a request to release the pending transactions.";
			owner_lazy = () -> com.tools20022.repository.codeset.RequestTypeCode.mmObject();
			codeName = "RT01";
		}
	};
	/**
	 * Type is a request to hold normal transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RequestTypeCode
	 * RequestTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RT02"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldNormal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type is a request to hold normal transactions."</li>
	 * </ul>
	 */
	public static final RequestTypeCode HoldNormal = new RequestTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldNormal";
			definition = "Type is a request to hold normal transactions.";
			owner_lazy = () -> com.tools20022.repository.codeset.RequestTypeCode.mmObject();
			codeName = "RT02";
		}
	};
	/**
	 * Type is a request to cancellation a transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RequestTypeCode
	 * RequestTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RT03"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancellation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type is a request to cancellation a transaction."</li>
	 * </ul>
	 */
	public static final RequestTypeCode Cancellation = new RequestTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancellation";
			definition = "Type is a request to cancellation a transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.RequestTypeCode.mmObject();
			codeName = "RT03";
		}
	};
	/**
	 * Type is a request to change the sequence of the transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RequestTypeCode
	 * RequestTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RT04"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReSequence"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type is a request to change the sequence of the transactions."</li>
	 * </ul>
	 */
	public static final RequestTypeCode ReSequence = new RequestTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReSequence";
			definition = "Type is a request to change the sequence of the transactions.";
			owner_lazy = () -> com.tools20022.repository.codeset.RequestTypeCode.mmObject();
			codeName = "RT04";
		}
	};
	/**
	 * Type is a request to release the suspicious transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RequestTypeCode
	 * RequestTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RT05"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReleaseSuspicious"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type is a request to release the suspicious transactions."
	 * </li>
	 * </ul>
	 */
	public static final RequestTypeCode ReleaseSuspicious = new RequestTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReleaseSuspicious";
			definition = "Type is a request to release the suspicious transactions.";
			owner_lazy = () -> com.tools20022.repository.codeset.RequestTypeCode.mmObject();
			codeName = "RT05";
		}
	};
	/**
	 * Type is an enquiry on the bank's position.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RequestTypeCode
	 * RequestTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RT11"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankPositionEnquiry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type is an enquiry on the bank's position."</li>
	 * </ul>
	 */
	public static final RequestTypeCode BankPositionEnquiry = new RequestTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankPositionEnquiry";
			definition = "Type is an enquiry on the bank's position.";
			owner_lazy = () -> com.tools20022.repository.codeset.RequestTypeCode.mmObject();
			codeName = "RT11";
		}
	};
	/**
	 * Type is an enquiry on a specific transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RequestTypeCode
	 * RequestTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RT12"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecificTransactionEnquiry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type is an enquiry on a specific transaction."</li>
	 * </ul>
	 */
	public static final RequestTypeCode SpecificTransactionEnquiry = new RequestTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecificTransactionEnquiry";
			definition = "Type is an enquiry on a specific transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.RequestTypeCode.mmObject();
			codeName = "RT12";
		}
	};
	/**
	 * Type is an enquiry on a queued transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RequestTypeCode
	 * RequestTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RT13"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueuedTransactionEnquiry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type is an enquiry on a queued transaction."</li>
	 * </ul>
	 */
	public static final RequestTypeCode QueuedTransactionEnquiry = new RequestTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueuedTransactionEnquiry";
			definition = "Type is an enquiry on a queued transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.RequestTypeCode.mmObject();
			codeName = "RT13";
		}
	};
	/**
	 * Type is an enquiry on a suspicious transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RequestTypeCode
	 * RequestTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RT14"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuspiciousTransactionEnquiry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type is an enquiry on a suspicious transaction."</li>
	 * </ul>
	 */
	public static final RequestTypeCode SuspiciousTransactionEnquiry = new RequestTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuspiciousTransactionEnquiry";
			definition = "Type is an enquiry on a suspicious transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.RequestTypeCode.mmObject();
			codeName = "RT14";
		}
	};
	/**
	 * Type is an enquiry on pending inward credits.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RequestTypeCode
	 * RequestTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RT15"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingInwardCreditsEnquiry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type is an enquiry on pending inward credits."</li>
	 * </ul>
	 */
	public static final RequestTypeCode PendingInwardCreditsEnquiry = new RequestTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingInwardCreditsEnquiry";
			definition = "Type is an enquiry on pending inward credits.";
			owner_lazy = () -> com.tools20022.repository.codeset.RequestTypeCode.mmObject();
			codeName = "RT15";
		}
	};
	final static private LinkedHashMap<String, RequestTypeCode> codesByName = new LinkedHashMap<>();

	protected RequestTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("RT01");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RequestTypeCode";
				definition = "Specifies the request used to further detail the type of information that will be queried.";
				derivation_lazy = () -> Arrays.asList(RequestType1Code.mmObject(), RequestType2Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RequestTypeCode.ReleasePending, com.tools20022.repository.codeset.RequestTypeCode.HoldNormal, com.tools20022.repository.codeset.RequestTypeCode.Cancellation,
						com.tools20022.repository.codeset.RequestTypeCode.ReSequence, com.tools20022.repository.codeset.RequestTypeCode.ReleaseSuspicious, com.tools20022.repository.codeset.RequestTypeCode.BankPositionEnquiry,
						com.tools20022.repository.codeset.RequestTypeCode.SpecificTransactionEnquiry, com.tools20022.repository.codeset.RequestTypeCode.QueuedTransactionEnquiry,
						com.tools20022.repository.codeset.RequestTypeCode.SuspiciousTransactionEnquiry, com.tools20022.repository.codeset.RequestTypeCode.PendingInwardCreditsEnquiry);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ReleasePending.getCodeName().get(), ReleasePending);
		codesByName.put(HoldNormal.getCodeName().get(), HoldNormal);
		codesByName.put(Cancellation.getCodeName().get(), Cancellation);
		codesByName.put(ReSequence.getCodeName().get(), ReSequence);
		codesByName.put(ReleaseSuspicious.getCodeName().get(), ReleaseSuspicious);
		codesByName.put(BankPositionEnquiry.getCodeName().get(), BankPositionEnquiry);
		codesByName.put(SpecificTransactionEnquiry.getCodeName().get(), SpecificTransactionEnquiry);
		codesByName.put(QueuedTransactionEnquiry.getCodeName().get(), QueuedTransactionEnquiry);
		codesByName.put(SuspiciousTransactionEnquiry.getCodeName().get(), SuspiciousTransactionEnquiry);
		codesByName.put(PendingInwardCreditsEnquiry.getCodeName().get(), PendingInwardCreditsEnquiry);
	}

	public static RequestTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RequestTypeCode[] values() {
		RequestTypeCode[] values = new RequestTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RequestTypeCode> {
		@Override
		public RequestTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RequestTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}