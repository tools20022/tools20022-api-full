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
 * Specifies the status of a single statistical reporting transaction or of a
 * group of statistical reporting transactions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatus2Code
 * StatisticalReportingStatus2Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatus1Code
 * StatisticalReportingStatus1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxReportingStatus2Code
 * TaxReportingStatus2Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxReportingStatus1Code
 * TaxReportingStatus1Code}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatusCode#mmAcceptedTechnicalValidation
 * StatisticalReportingStatusCode.mmAcceptedTechnicalValidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatusCode#mmReceived
 * StatisticalReportingStatusCode.mmReceived}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatusCode#mmPartiallyAccepted
 * StatisticalReportingStatusCode.mmPartiallyAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatusCode#mmRejected
 * StatisticalReportingStatusCode.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatusCode#mmPending
 * StatisticalReportingStatusCode.mmPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatusCode#mmAccepted
 * StatisticalReportingStatusCode.mmAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatusCode#mmWarning
 * StatisticalReportingStatusCode.mmWarning}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatusCode#mmReminder
 * StatisticalReportingStatusCode.mmReminder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatusCode#mmCorruptedFile
 * StatisticalReportingStatusCode.mmCorruptedFile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatusCode#mmIncorrectFilename
 * StatisticalReportingStatusCode.mmIncorrectFilename}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatusCode#mmAcceptedAfterPending
 * StatisticalReportingStatusCode.mmAcceptedAfterPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatusCode#mmRejectedAfterPending
 * StatisticalReportingStatusCode.mmRejectedAfterPending}</li>
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
 * <li>"ACTC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StatisticalReportingStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the status of a single statistical reporting transaction or of a group of statistical reporting transactions."
 * </li>
 * </ul>
 */
public class StatisticalReportingStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Transaction or report has passed syntactical and semantical validation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatusCode
	 * StatisticalReportingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACTC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedTechnicalValidation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction or report has passed syntactical and semantical validation."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAcceptedTechnicalValidation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedTechnicalValidation";
			definition = "Transaction or report has passed syntactical and semantical validation.";
			owner_lazy = () -> StatisticalReportingStatusCode.mmObject();
			codeName = "ACTC";
		}
	};
	/**
	 * Report has been received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatusCode
	 * StatisticalReportingStatusCode}</li>
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
	 * definition} = "Report has been received."</li>
	 * </ul>
	 */
	public static final MMCode mmReceived = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Received";
			definition = "Report has been received.";
			owner_lazy = () -> StatisticalReportingStatusCode.mmObject();
			codeName = "RCVD";
		}
	};
	/**
	 * Report has been partially accepted. A number of transactions have been
	 * accepted, whereas another number of transactions have not yet been
	 * accepted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatusCode
	 * StatisticalReportingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PART"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartiallyAccepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Report has been partially accepted. A number of transactions have been accepted, whereas another number of transactions have not yet been accepted."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPartiallyAccepted = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartiallyAccepted";
			definition = "Report has been partially accepted. A number of transactions have been accepted, whereas another number of transactions have not yet been accepted.";
			owner_lazy = () -> StatisticalReportingStatusCode.mmObject();
			codeName = "PART";
		}
	};
	/**
	 * Transaction or report has been rejected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatusCode
	 * StatisticalReportingStatusCode}</li>
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
	 * definition} = "Transaction or report has been rejected."</li>
	 * </ul>
	 */
	public static final MMCode mmRejected = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Transaction or report has been rejected.";
			owner_lazy = () -> StatisticalReportingStatusCode.mmObject();
			codeName = "RJCT";
		}
	};
	/**
	 * Processing of transaction or report is pending.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatusCode
	 * StatisticalReportingStatusCode}</li>
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
	 * definition} = "Processing of transaction or report is pending."</li>
	 * </ul>
	 */
	public static final MMCode mmPending = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pending";
			definition = "Processing of transaction or report is pending.";
			owner_lazy = () -> StatisticalReportingStatusCode.mmObject();
			codeName = "PDNG";
		}
	};
	/**
	 * Transaction or report has been accepted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatusCode
	 * StatisticalReportingStatusCode}</li>
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
	 * definition} = "Transaction or report has been accepted."</li>
	 * </ul>
	 */
	public static final MMCode mmAccepted = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accepted";
			definition = "Transaction or report has been accepted.";
			owner_lazy = () -> StatisticalReportingStatusCode.mmObject();
			codeName = "ACPT";
		}
	};
	/**
	 * Transaction has been accepted with warnings.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatusCode
	 * StatisticalReportingStatusCode}</li>
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
	 * definition} = "Transaction has been accepted with warnings."</li>
	 * </ul>
	 */
	public static final MMCode mmWarning = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Warning";
			definition = "Transaction has been accepted with warnings.";
			owner_lazy = () -> StatisticalReportingStatusCode.mmObject();
			codeName = "WARN";
		}
	};
	/**
	 * Reminder of a non received report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatusCode
	 * StatisticalReportingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RMDR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reminder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reminder of a non received report."</li>
	 * </ul>
	 */
	public static final MMCode mmReminder = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reminder";
			definition = "Reminder of a non received report.";
			owner_lazy = () -> StatisticalReportingStatusCode.mmObject();
			codeName = "RMDR";
		}
	};
	/**
	 * File containing the report is corrupted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatusCode
	 * StatisticalReportingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRPT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorruptedFile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "File containing the report is corrupted."</li>
	 * </ul>
	 */
	public static final MMCode mmCorruptedFile = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorruptedFile";
			definition = "File containing the report is corrupted.";
			owner_lazy = () -> StatisticalReportingStatusCode.mmObject();
			codeName = "CRPT";
		}
	};
	/**
	 * File containing the report has an incorrect filename.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatusCode
	 * StatisticalReportingStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INCF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectFilename"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "File containing the report has an incorrect filename."</li>
	 * </ul>
	 */
	public static final MMCode mmIncorrectFilename = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectFilename";
			definition = "File containing the report has an incorrect filename.";
			owner_lazy = () -> StatisticalReportingStatusCode.mmObject();
			codeName = "INCF";
		}
	};
	/**
	 * Transaction or report has been accepted, following a pending status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatusCode
	 * StatisticalReportingStatusCode}</li>
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
	 * definition} =
	 * "Transaction or report has been accepted, following a pending status."</li>
	 * </ul>
	 */
	public static final MMCode mmAcceptedAfterPending = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedAfterPending";
			definition = "Transaction or report has been accepted, following a pending status.";
			owner_lazy = () -> StatisticalReportingStatusCode.mmObject();
			codeName = "ACPD";
		}
	};
	/**
	 * Transaction or report has been rejected, following a pending status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatisticalReportingStatusCode
	 * StatisticalReportingStatusCode}</li>
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
	 * definition} =
	 * "Transaction or report has been rejected, following a pending status."</li>
	 * </ul>
	 */
	public static final MMCode mmRejectedAfterPending = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedAfterPending";
			definition = "Transaction or report has been rejected, following a pending status.";
			owner_lazy = () -> StatisticalReportingStatusCode.mmObject();
			codeName = "RJPD";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("ACTC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StatisticalReportingStatusCode";
				definition = "Specifies the status of a single statistical reporting transaction or of a group of statistical reporting transactions.";
				code_lazy = () -> Arrays.asList(StatisticalReportingStatusCode.mmAcceptedTechnicalValidation, StatisticalReportingStatusCode.mmReceived, StatisticalReportingStatusCode.mmPartiallyAccepted,
						StatisticalReportingStatusCode.mmRejected, StatisticalReportingStatusCode.mmPending, StatisticalReportingStatusCode.mmAccepted, StatisticalReportingStatusCode.mmWarning, StatisticalReportingStatusCode.mmReminder,
						StatisticalReportingStatusCode.mmCorruptedFile, StatisticalReportingStatusCode.mmIncorrectFilename, StatisticalReportingStatusCode.mmAcceptedAfterPending, StatisticalReportingStatusCode.mmRejectedAfterPending);
				derivation_lazy = () -> Arrays.asList(StatisticalReportingStatus2Code.mmObject(), StatisticalReportingStatus1Code.mmObject(), TaxReportingStatus2Code.mmObject(), TaxReportingStatus1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}