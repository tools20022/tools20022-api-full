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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the request used to further detail the type of information that
 * will be queried.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RequestTypeCode#mmReleasePending
 * RequestTypeCode.mmReleasePending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RequestTypeCode#mmHoldNormal
 * RequestTypeCode.mmHoldNormal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RequestTypeCode#mmCancellation
 * RequestTypeCode.mmCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RequestTypeCode#mmReSequence
 * RequestTypeCode.mmReSequence}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RequestTypeCode#mmReleaseSuspicious
 * RequestTypeCode.mmReleaseSuspicious}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RequestTypeCode#mmBankPositionEnquiry
 * RequestTypeCode.mmBankPositionEnquiry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RequestTypeCode#mmSpecificTransactionEnquiry
 * RequestTypeCode.mmSpecificTransactionEnquiry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RequestTypeCode#mmQueuedTransactionEnquiry
 * RequestTypeCode.mmQueuedTransactionEnquiry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RequestTypeCode#mmSuspiciousTransactionEnquiry
 * RequestTypeCode.mmSuspiciousTransactionEnquiry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RequestTypeCode#mmPendingInwardCreditsEnquiry
 * RequestTypeCode.mmPendingInwardCreditsEnquiry}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
public class RequestTypeCode {

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
	public static final MMCode mmReleasePending = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReleasePending";
			definition = "Type is a request to release the pending transactions.";
			owner_lazy = () -> RequestTypeCode.mmObject();
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
	public static final MMCode mmHoldNormal = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldNormal";
			definition = "Type is a request to hold normal transactions.";
			owner_lazy = () -> RequestTypeCode.mmObject();
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
	public static final MMCode mmCancellation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancellation";
			definition = "Type is a request to cancellation a transaction.";
			owner_lazy = () -> RequestTypeCode.mmObject();
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
	 * "Type is a request to change the sequence of the  transactions."</li>
	 * </ul>
	 */
	public static final MMCode mmReSequence = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReSequence";
			definition = "Type is a request to change the sequence of the  transactions.";
			owner_lazy = () -> RequestTypeCode.mmObject();
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
	public static final MMCode mmReleaseSuspicious = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReleaseSuspicious";
			definition = "Type is a request to release the suspicious transactions.";
			owner_lazy = () -> RequestTypeCode.mmObject();
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
	public static final MMCode mmBankPositionEnquiry = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankPositionEnquiry";
			definition = "Type is an enquiry on the bank's position.";
			owner_lazy = () -> RequestTypeCode.mmObject();
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
	public static final MMCode mmSpecificTransactionEnquiry = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecificTransactionEnquiry";
			definition = "Type is an enquiry on a specific transaction.";
			owner_lazy = () -> RequestTypeCode.mmObject();
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
	public static final MMCode mmQueuedTransactionEnquiry = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueuedTransactionEnquiry";
			definition = "Type is an enquiry on a queued transaction.";
			owner_lazy = () -> RequestTypeCode.mmObject();
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
	public static final MMCode mmSuspiciousTransactionEnquiry = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuspiciousTransactionEnquiry";
			definition = "Type is an enquiry on a suspicious transaction.";
			owner_lazy = () -> RequestTypeCode.mmObject();
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
	public static final MMCode mmPendingInwardCreditsEnquiry = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingInwardCreditsEnquiry";
			definition = "Type is an enquiry on pending inward credits.";
			owner_lazy = () -> RequestTypeCode.mmObject();
			codeName = "RT15";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("RT01");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RequestTypeCode";
				definition = "Specifies the request used to further detail the type of information that will be queried.";
				code_lazy = () -> Arrays.asList(RequestTypeCode.mmReleasePending, RequestTypeCode.mmHoldNormal, RequestTypeCode.mmCancellation, RequestTypeCode.mmReSequence, RequestTypeCode.mmReleaseSuspicious,
						RequestTypeCode.mmBankPositionEnquiry, RequestTypeCode.mmSpecificTransactionEnquiry, RequestTypeCode.mmQueuedTransactionEnquiry, RequestTypeCode.mmSuspiciousTransactionEnquiry,
						RequestTypeCode.mmPendingInwardCreditsEnquiry);
				derivation_lazy = () -> Arrays.asList(RequestType1Code.mmObject(), RequestType2Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}