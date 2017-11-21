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
 * Specifies the status of the processing of an individual record within a
 * message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RecordStatusCode#mmAccepted
 * RecordStatusCode.mmAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RecordStatusCode#mmAcceptedAfterPending
 * RecordStatusCode.mmAcceptedAfterPending}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RecordStatusCode#mmPending
 * RecordStatusCode.mmPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RecordStatusCode#mmReceived
 * RecordStatusCode.mmReceived}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RecordStatusCode#mmRejected
 * RecordStatusCode.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RecordStatusCode#mmRejectedAfterPending
 * RecordStatusCode.mmRejectedAfterPending}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RecordStatusCode#mmWarning
 * RecordStatusCode.mmWarning}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ReportingRecordStatus1Code
 * ReportingRecordStatus1Code}</li>
 * </ul>
 * </li>
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
 * "RecordStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the status of the processing of an individual record within a message."
 * </li>
 * </ul>
 */
public class RecordStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Record has been accepted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RecordStatusCode
	 * RecordStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACPT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Record has been accepted."</li>
	 * </ul>
	 */
	public static final MMCode mmAccepted = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accepted";
			definition = "Record has been accepted.";
			owner_lazy = () -> RecordStatusCode.mmObject();
			codeName = "ACPT";
		}
	};
	/**
	 * Record has been accepted, following a pending status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RecordStatusCode
	 * RecordStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACPD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedAfterPending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Record has been accepted, following a pending status."</li>
	 * </ul>
	 */
	public static final MMCode mmAcceptedAfterPending = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedAfterPending";
			definition = "Record has been accepted, following a pending status.";
			owner_lazy = () -> RecordStatusCode.mmObject();
			codeName = "ACPD";
		}
	};
	/**
	 * Processing of the record is pending (some validation rules have been
	 * executed but some have not and the final status is not known yet).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RecordStatusCode
	 * RecordStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PDNG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Processing of the record is pending (some validation rules have been executed but some have not and the final status is not known yet)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPending = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pending";
			definition = "Processing of the record is pending (some validation rules have been executed but some have not and the final status is not known yet).";
			owner_lazy = () -> RecordStatusCode.mmObject();
			codeName = "PDNG";
		}
	};
	/**
	 * Recrod has been received but not processed yet.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RecordStatusCode
	 * RecordStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RCVD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Received"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Recrod has been received but not processed yet."</li>
	 * </ul>
	 */
	public static final MMCode mmReceived = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Received";
			definition = "Recrod has been received but not processed yet.";
			owner_lazy = () -> RecordStatusCode.mmObject();
			codeName = "RCVD";
		}
	};
	/**
	 * Record has been rejected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RecordStatusCode
	 * RecordStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RJCT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Record has been rejected."</li>
	 * </ul>
	 */
	public static final MMCode mmRejected = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Record has been rejected.";
			owner_lazy = () -> RecordStatusCode.mmObject();
			codeName = "RJCT";
		}
	};
	/**
	 * Record has been rejected, following a pending status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RecordStatusCode
	 * RecordStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RJPD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedAfterPending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Record has been rejected, following a pending status."</li>
	 * </ul>
	 */
	public static final MMCode mmRejectedAfterPending = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedAfterPending";
			definition = "Record has been rejected, following a pending status.";
			owner_lazy = () -> RecordStatusCode.mmObject();
			codeName = "RJPD";
		}
	};
	/**
	 * Record has been accepted with warnings.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RecordStatusCode
	 * RecordStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WARN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Warning"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Record has been accepted with warnings."</li>
	 * </ul>
	 */
	public static final MMCode mmWarning = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Warning";
			definition = "Record has been accepted with warnings.";
			owner_lazy = () -> RecordStatusCode.mmObject();
			codeName = "WARN";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RecordStatusCode";
				definition = "Specifies the status of the processing of an individual record within a message.";
				code_lazy = () -> Arrays.asList(RecordStatusCode.mmAccepted, RecordStatusCode.mmAcceptedAfterPending, RecordStatusCode.mmPending, RecordStatusCode.mmReceived, RecordStatusCode.mmRejected,
						RecordStatusCode.mmRejectedAfterPending, RecordStatusCode.mmWarning);
				derivation_lazy = () -> Arrays.asList(ReportingRecordStatus1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}